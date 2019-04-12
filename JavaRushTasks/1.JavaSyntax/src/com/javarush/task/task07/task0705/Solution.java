package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < arr.length ; i++) {
            String s = b.readLine();
            arr[i] = Integer.parseInt(s);
        }

        for (int i = 0; i < 10 ; i++) {
            arr1[i] = arr[i];
        }

        for (int i = 10; i < 20 ; i++) {
            arr2[i-10] = arr[i];
        }

        for (int i = 0; i < 10 ; i++) {
            System.out.println(arr2[i]);
        }
    }
}
