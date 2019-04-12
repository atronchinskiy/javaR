package com.javarush.task.task13.task1319;

/*
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter outStream = new BufferedWriter(new FileWriter(buf.readLine()));

        String str = new String();
        char ch = 13;
        int ind = 0;
               //byte [] b;

        do{
            str = buf.readLine();
            outStream.write(str.toCharArray());//+ Byte.parseByte(Character.toString((char) 10)) );
            outStream.newLine();

        }while (!str.contains("exit"));
        //byte tt;


        buf.close();
        outStream.close();


    }
}
