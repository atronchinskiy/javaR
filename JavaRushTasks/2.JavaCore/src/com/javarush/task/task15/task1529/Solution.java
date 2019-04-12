package com.javarush.task.task15.task1529;

/*
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        try {
            Solution.reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        //add your code here - добавьте код тут
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String s = b.readLine();

        if (s.contains("helicopter")){
            result = new Helicopter();
        }
        else if (s.contains("plane")){
            result = new Plane(Integer.parseInt(b.readLine()));
        }

        b.close();

    }
}
