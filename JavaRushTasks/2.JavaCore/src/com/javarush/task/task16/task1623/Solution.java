package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        new GenerateThread();
    }

    public static class GenerateThread extends Thread{
        //private static volatile int threadCount = 0;
        //private volatile int countdownIndex = COUNT;

        public GenerateThread (){
            super(String.valueOf(++createdThreadCount));
            start();
        }
        public String toString() {
            return getName() + " created";
        }

        @Override
        public void run() {
            if (Solution.createdThreadCount <= Solution.count) {
                System.out.println(new GenerateThread().toString());
            };
        }
    }
}
