package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {

        int cnt;


        do {
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

            FileInputStream f1 = new FileInputStream(buf.readLine());

            cnt = f1.available();

            if (f1.available() < 1000) {
                f1.close();
                buf.close();
                throw new DownloadException();
            }
            f1.close();
            buf.close();

        } while (cnt >= 1000);
    }

    public static class DownloadException extends Exception {

    }
}
