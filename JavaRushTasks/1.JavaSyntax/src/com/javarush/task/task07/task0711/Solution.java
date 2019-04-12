package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;/*
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> s = new ArrayList<String>();
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++){
            s.add(b.readLine());
        }

        String last_str;
        for (int i = 0; i < 13; i++){
            last_str = s.get(4);
            s.remove(4);
            s.add(0, last_str);
        }

        for (int i = 0; i < 5; i++){
            System.out.println(s.get(i));;
        }
    }
}
