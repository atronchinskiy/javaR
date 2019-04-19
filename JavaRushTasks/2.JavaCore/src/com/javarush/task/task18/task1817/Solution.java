package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

       /* FileInputStream ff = new FileInputStream(args[0]);
        int cnt = 0;
        int p = 0;

        while (ff.available() > 0) {
            int c = ff.read();

            cnt++;

            if (c == 32) {
                p++;
            }
        }
        ff.close();

        float res = (float) p / cnt;
        //double d = new BigDecimal(p / cnt).setScale(2, RoundingMode.HALF_UP).doubleValue();
        System.out.printf("%.2f", res);
        //System.out.println(d);*/



            FileReader f = new FileReader(args[0]);

            int spaceCount = 0;
            int charCount = 0;
            while (f.ready()) {
                char ch = (char) f.read();
                charCount++;

                if (ch == ' ')
                    spaceCount++;

            }

            f.close();

            System.out.println(String.format("%.2f", ((float) spaceCount / charCount) * 100));



        }
}
