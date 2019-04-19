package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileOutputStream out1 = new FileOutputStream(new File(reader.readLine()));
        FileInputStream in2 = new FileInputStream(new File(reader.readLine()));
        FileInputStream in3 = new FileInputStream(new File(reader.readLine()));

//        FileOutputStream out1 = new FileOutputStream("c:/10.txt");
//        FileInputStream in2 = new FileInputStream("c:/temp1.txt");
//        FileInputStream in3 = new FileInputStream("c:/temp2.txt");
//

        byte[] o2 = new byte[in2.available()];
        byte[] o3 = new byte[in3.available()];

        int i2 = in2.read(o2);
        int i3 = in3.read(o3);

        out1.write(o2);
        out1.write(o3);

        reader.close();
        in2.close();
        in3.close();
        out1.close();


    }
}
