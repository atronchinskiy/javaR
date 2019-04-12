package com.javarush.task.task07.task0715;

/*
Продолжаем мыть раму
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();

        strings.add(0,"мама");
        strings.add(1,"мыла");
        strings.add(2,"раму");

        strings.add(1,"именно");
        strings.add(3,"именно");
        strings.add(5,"именно");


        for (String s: strings){
            System.out.println(s);
        }

    }
}
