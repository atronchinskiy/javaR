package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        //String s = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
        //String s = "http://javarush.ru/alpha/index.html?obj=3.14r&name=Amigo";
        String valStr;
        Double valDoub;
        char[] c = s.toCharArray();
        char[] cD;
        StringBuilder strB = new StringBuilder();
        StringBuilder strManual = new StringBuilder();

        String strDoub = null;
        //URL aURL = new URL("http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo");
        //URL aURL = new URL("http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo");
        //System.out.println("ответ " + aURL.getQuery());

        if (s.indexOf("obj=") > -1) {
            strB.append("obj");
        } else {
            for (int i = s.indexOf("?") + 1; i < s.indexOf("&"); i++) {
                if ((c[i] >= 65 & c[i] <= 90) | (c[i] >= 97 & c[i] <= 122)) {
                    strB.append(c[i]);
                }
            }
        }

        strB.append(" ");

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 38) {
                i = i+ 1;
                for (i = i; i < c.length; i++) {
                    if ((c[i] >= 65 & c[i] <= 90) | (c[i] >= 97 & c[i] <= 122)) {
                        strB.append(c[i]);
                        //System.out.println(strB);
                    } else {
                        strB.append(" ");
                        i--;
                        break;
                    }
                }
            }
        }




        System.out.println(strB);

        if (s.indexOf("obj=") > -1) {
            strDoub = s.substring(s.indexOf("obj=") + 4, s.indexOf("&"));
            cD = strDoub.toCharArray();

            try {
                double d = Double.parseDouble(strDoub);
                alert(d);

            } catch (NumberFormatException e) {

                alert(strDoub);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
