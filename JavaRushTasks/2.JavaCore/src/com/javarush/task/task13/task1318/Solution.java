package com.javarush.task.task13.task1318;

import java.io.*;/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args)  throws IOException {
        // напишите тут ваш код
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        InputStream inStream = new FileInputStream(b.readLine());

        while (inStream.available() > 0)
        {
            //System.out.println(inStream.read()); //читаем один байт из потока для чтения
            System.out.print(Character.toString((char) inStream.read()));
        }

        inStream.close(); //закрываем потоки
        b.close();
        //outStream.close();
    }
}