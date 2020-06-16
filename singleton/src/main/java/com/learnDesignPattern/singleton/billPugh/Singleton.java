package com.learnDesignPattern.singleton.billPugh;

public class Singleton {

    private int data = 0;

    private Singleton() {}

    private static class SingletonHelper {
        private static final Singleton uniqueInstance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
