package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;/*
Максимальный байт
*/
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int byte_curr = 0;
        int byte_next = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream f = new FileInputStream(bufferedReader.readLine());

        while (f.available() > 0){
            byte_next = f.read();

            if (byte_next > byte_curr){
                byte_curr = byte_next;
            }
        }
        f.close();
        //System.out.println(String.valueOf((char) byte_curr));
        System.out.println(byte_curr);
    }
}
