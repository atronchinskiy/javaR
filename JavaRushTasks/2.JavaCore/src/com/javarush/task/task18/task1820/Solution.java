package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        String s1 = b.readLine();
        String s2 = b.readLine();
//
//        String s1 = "c:/temp1.txt";
//        String s2 = "c:/temp2.txt";
        
        StringBuilder sb = new StringBuilder();

        FileReader f1In = new FileReader(s1);

        FileWriter f2Out = new FileWriter(s2, false);

        while (f1In.ready()){
            sb.append((char) f1In.read());
        }

        String [] s = sb.toString().split(" ");
        StringBuilder sb2 = new StringBuilder();

        for(int i = 0; i < s.length; i++){
            //sb2.append(new BigDecimal(s[i]).setScale(0, RoundingMode.HALF_UP).toString() + " ");
            String str = String.valueOf(Math.round(Float.parseFloat(s[i]))) + " ";
            sb2.append(str);
        }

        //System.out.println(sb2.toString());

        f2Out.write(sb2.toString());

        f1In.close();
        f2Out.close();
    }
}
