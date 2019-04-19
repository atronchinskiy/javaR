package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream f = new FileInputStream(buf.readLine());

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        while (f.available() > 0){
            int key = f.read();

            if (map.get(key) == null){
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        f.close();

        int buf_min = 65000;

        if (!map.isEmpty()){
            //buf_max = map.get(0);

            for (Map.Entry<Integer, Integer> item: map.entrySet()){
                if (buf_min > item.getValue()){
                    buf_min = item.getValue();
                }
            }

            for (Map.Entry<Integer, Integer> item: map.entrySet()){
                if (buf_min == item.getValue()){
                    System.out.print(item.getKey() + " ");
                }
            }
        }
    }
}
