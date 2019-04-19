package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream f = new FileInputStream(buf.readLine());

        TreeSet<Integer> t = new TreeSet<Integer>();

        while (f.available() > 0){
           t.add(f.read());
        }
        f.close();

        for (Integer item: t){
            System.out.print(item + " ");
        }

    }
}
