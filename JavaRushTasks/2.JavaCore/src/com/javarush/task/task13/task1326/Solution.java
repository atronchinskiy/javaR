package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        //InputStream inStream = new FileInputStream(b.readLine());
        InputStream inStream = new FileInputStream("c://1.txt");

        ArrayList<Integer> aL = new ArrayList<>();

        StringBuilder sb = new StringBuilder("");
        String str = "";
        int i;

        int k;

        while (inStream.available() > 0) {
            //System.out.println(inStream.read()); //читаем один байт из потока для чтения
            //String s =  Character.toString((char) inStream.read());
            //Character c = (char) inStream.read();
            i = inStream.read();
            k = inStream.available();

            if (i != 10 &&  i != 13){
                String ss = Character.toString((char) i);
                sb.append(ss);
                //System.out.println(ss);

            } else if (i == 10 || i == 13 || k == 0){
                if (!sb.toString().equals(str)){
                    if(Integer.parseInt(sb.toString())%2 == 0) {
                        aL.add(Integer.parseInt(sb.toString()));
                    }
                    sb = new StringBuilder("");
                }
            }

            //System.out.print(Character.toString((char) inStream.read()));

            //String s =  Character.toString((char) inStream.read()); inStream.
            //System.out.println(Integer.parseInt(s));

            //System.out.println(Character.toString((char) inStream.read()));
            //System.out.println(Integer.parseInt(s));
        }

        inStream.close(); //закрываем потоки
        b.close();

        int arr [] = new int [aL.size()];

        for (int j = 0; j < aL.size(); j++){
            arr[j] = aL.get(j);
        }

        Arrays.sort(arr);

        for (int buf : arr){
            System.out.println(buf);
        }
    }
}
/*
        i

    }
}*/
