package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream f = new FileInputStream(args[0]);
        int cnt = 0;

        while(f.available() > 0) {
            int c = f.read();
            if ((c > 64 && c < 91) || ((c > 96 && c < 123))) cnt++;
        }

        System.out.println(cnt);
        f.close();

    }
}
