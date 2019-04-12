package com.javarush.task.task14.task1421;

/**
 * Created by tab65 on 22.01.2019.
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {
    }
    public static Singleton getInstance(){
        return (instance == null) ? instance = new Singleton() : instance;
    }
}
