package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();

        while (!s.equals("exit")) {
            char[] cDot = s.toCharArray();
            Arrays.sort(cDot);

            if ((cDot.length > 1 && (cDot[0] == 46 & (cDot[1] >= 48 & cDot[1] <= 57) & (cDot[cDot.length - 1] >= 48 & cDot[cDot.length - 1] <= 57))) |
                    (cDot.length > 2 && ( cDot[0] == 45 &  cDot[1] == 46 & (cDot[2] >= 48 & cDot[2] <= 57) & (cDot[cDot.length - 1] >= 48 & cDot[cDot.length - 1] <= 57)))){
                Solution.print(Double.parseDouble(s));
            } else if ((cDot[0] >= 48 & cDot[0] <= 57) & (cDot[cDot.length - 1] >= 48 & cDot[cDot.length - 1] <= 57) |
                    (cDot.length > 1 && (cDot[0] >= 45 & cDot[1] >= 48 & cDot[1] <= 57) & (cDot[cDot.length - 1] >= 48 & cDot[cDot.length - 1] <= 57))){
                if(Integer.parseInt(s) > 0 & Integer.parseInt(s) < 128){
                    Solution.print(Short.parseShort(s));
                }else if(Integer.parseInt(s) <= 0 | Integer.parseInt(s) >= 128){
                    //Integer ii = Integer.parseInt(s);
                    Solution.print(Integer.parseInt(s));
                }
            } else Solution.print(s);

            s = r.readLine();
        }
    }




    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
