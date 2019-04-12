package com.javarush.task.task07.task0703;

/*
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String[] sar= new String[10];
        int[] iar = new int[10];

        for (int i = 0; i < sar.length; i++) {
            sar[i] = b.readLine();
            iar[i] = sar[i].length();
        }

        for (int i = 0; i < iar.length; i++) {
            System.out.println(iar[i]);
        }

    }
}
