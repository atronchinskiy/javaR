package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        ArrayList<Integer> a3 = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++){
            a.add(Integer.parseInt(b.readLine()));
        }

        for (int i = 0; i < a.size(); i++){
            if (a.get(i) % 3 == 0){
                a1.add(a.get(i));
            }
            if (a.get(i) % 2 == 0){
                a2.add(a.get(i));
            }
            if (a.get(i) % 3 != 0 & a.get(i) % 2 != 0) {
                a3.add(a.get(i));
            }

        }

        printList(a1);
        printList(a2);
        printList(a3);

    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
