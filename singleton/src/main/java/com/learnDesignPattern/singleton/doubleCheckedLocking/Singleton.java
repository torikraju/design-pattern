package com.learnDesignPattern.singleton.doubleCheckedLocking;

public class Singleton {

    private volatile static Singleton uniqueInstance = null;

    private int data = 0;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (null == uniqueInstance) {
            synchronized (Singleton.class) {
                if (null == uniqueInstance) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
