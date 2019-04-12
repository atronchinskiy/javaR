package com.javarush.task.task17.task1705;

import java.util.ArrayList;
import java.util.List;

/* 
Сад-огород
*/

public class Solution {


    public static void main(String[] args) {

    }

    public static class Garden {

        public final List<String> fruits = new ArrayList<String>();
        public final List<String> vegetables = new ArrayList<String>();

        public synchronized void addFruit ( int index, String fruit){//Добавляем везде синхронизацию в методах
            this.fruits.add(index, fruit);
        }

        public synchronized void removeFruit ( int index){//тут
            this.fruits.remove(index);
        }

        public synchronized void addVegetable ( int index, String vegetable){//тут
            this.vegetables.add(index, vegetable);
        }

        public synchronized void removeVegetable ( int index){//тут
            this.vegetables.remove(index);
        }

    }


}
