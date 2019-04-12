package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;/*
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        //ArrayList<String> s = new ArrayList<String>();
        ArrayList<String> strings = new ArrayList<String>();
        //ArrayList<Integer> ind = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++){
            strings.add(b.readLine());
        }

        int mn = 0;
        int l_mn = strings.get(0).length();
        int mx = 0;
        int l_mx = strings.get(0).length();

        for (int i = 0; i < strings.size(); i++){
            if (strings.get(i).length() > l_mx){
                mx= i;
                l_mx = strings.get(i).length();
            }
            if (strings.get(i).length() < l_mn){
                mn = i;
                l_mn = strings.get(i).length();
            }
        }
        //System.out.println(m);


            if (mn < mx) {
                System.out.println(strings.get(mn));
            } else if (mn > mx) {
                System.out.println(strings.get(mx));
            }
    }
}
