package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();//"c:/1.txt";
            secondFileName = reader.readLine(); //"c:/1.txt";;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        protected String path;
        public StringBuilder s = new StringBuilder("");

        @Override
        public void setFileName(String fullFileName) {
            path = fullFileName;
        }

        @Override
        public String getFileContent() {
            return s.toString();
        }



        @Override
        public void start() {
            this.run();
        }

        public void run() {
            try(FileReader reader = new FileReader(path))
            {
                // читаем посимвольно
                int c;
                while((c=reader.read())!=-1){

                    //System.out.print((char)c);
                    if (c != 13 && c != 10) {
                        s.append((char) c);
                    } else {
                        s.append((char) 32);
                    };
                    //System.out.println(s);

                }
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
