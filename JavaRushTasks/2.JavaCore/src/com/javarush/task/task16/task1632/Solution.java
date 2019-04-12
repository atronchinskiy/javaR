package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) {
        threads.get(0);
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e.getClass().getSimpleName());
                }
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        @Override
        public void showWarning() {
            if (this.isAlive()) {
                this.interrupt();
            }
        }
    }

    public static class Thread5 extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int i;
        @Override
        public void run() {
            try {
                while (!(s = reader.readLine()).equals("N")) {
                    i += Integer.parseInt(s);
                }
                System.out.println(i);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}