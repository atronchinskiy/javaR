package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!
*/

public class Solution {
    public static void main(String[] args) {
        Student s = new StudentImpl("11");
        System.out.println(s.getName());
    }




}
