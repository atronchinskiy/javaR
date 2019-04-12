package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());


            if (a <= 0 || b <= 0){
                throw new ArithmeticException();
            }




        int tmp;

        while (b !=0) {
            tmp = a%b;
            a = b;
            b = tmp;
        }

        System.out.println(a);

    }
}
