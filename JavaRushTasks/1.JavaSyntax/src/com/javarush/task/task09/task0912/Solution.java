package com.javarush.task.task09.task0912;

/* 
Исключение при работе с числами
*/

public class Solution {


    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
       Test q = new Test(2, 3);
        System.out.println(q.a + " " + q.b);
        q.ch1();
        //q.ch(q);
        System.out.println(q.a + " " + q.b);

    }


}
