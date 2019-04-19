package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        String s1 = b.readLine();
        String s2 = b.readLine();
//
//        String s1 = "c:/temp1.txt";
//        String s2 = "c:/temp2.txt";

        FileInputStream f1In = new FileInputStream(s1);

        byte[] b1 = new byte[f1In.available()];
        int i1 = f1In.read(b1);

        FileOutputStream f1Out = new FileOutputStream(s1, false);

        FileInputStream f2In = new FileInputStream(s2);


        byte[] b2 = new byte[f2In.available()];
        int i2 = f2In.read(b2);

        f1Out.write(b2);

        f1Out.write(b1);

        f1Out.close();
        f1In.close();
        f2In.close();




    }
}
