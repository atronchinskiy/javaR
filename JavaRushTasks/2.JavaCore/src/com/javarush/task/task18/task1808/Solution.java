package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
/*        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = buf.readLine().split(" ", 3);

        FileInputStream f1 = new FileInputStream(buf.readLine());
        FileOutputStream f2 = new FileOutputStream(buf.readLine());
        FileOutputStream f3 = new FileOutputStream(buf.readLine());

        FileInputStream f1 = new FileInputStream("c:/10.txt");
        FileOutputStream f2 = new FileOutputStream("c:/temp1.txt");
        FileOutputStream f3 = new FileOutputStream("c:/temp2.txt");

        int cnt;

        byte[] buffer1 = new byte[f1.available() / 2];

        cnt = f1.read(buffer1);
        f2.write(buffer1);
        f2.close();

        byte[] buffer2 = new byte[f1.available()];
        cnt = f1.read(buffer2);
        f3.write(buffer2);
        f3.close();


        f1.close();
        buf.close();

        FileInputStream f4 = new FileInputStream("c:/temp1.txt");
        FileInputStream f5 = new FileInputStream("c:/temp2.txt");
        System.out.printf("%d %d", f4.available(), f5.available());*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(new File(reader.readLine()));
        FileOutputStream out2 = new FileOutputStream(new File(reader.readLine()));
        FileOutputStream out3 = new FileOutputStream(new File(reader.readLine()));



        while(in.available() > 0){
            if(in.available() % 2 == 0){
                byte[] o1 = new byte[in.available()/2];
                byte[] o2 = new byte[in.available()/2];
                int count1 = in.read(o1);
                int count2 = in.read(o2);
                out2.write(o1, 0, count1);
                out3.write(o2, 0, count2);
            } else {
                byte[] o1 = new byte[in.available()/2 + 1];
                byte[] o2 = new byte[in.available()/2];
                int count1 = in.read(o1);
                int count2 = in.read(o2);
                out2.write(o1, 0, count1);
                out3.write(o2, 0, count2);
            }
        }

        reader.close();
        in.close();
        out2.close();
        out3.close();

    }
}
