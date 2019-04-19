package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream f1 = new FileInputStream(buf.readLine());
        FileOutputStream f2 = new FileOutputStream(buf.readLine());


//        FileInputStream f1 = new FileInputStream("c:/10.txt");
//        FileOutputStream f2 = new FileOutputStream("c:/temp1.txt");


        byte[] buffer1 = new byte[f1.available()];

        int cnt = f1.read(buffer1);

        for (int i = 1; i <= cnt ; i++){
            f2.write(buffer1[cnt - i]);
        }

        f2.close();
        f1.close();
        buf.close();;

    }
}
