package com.learnDesignPattern.proxy;

public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("someFileName.jpeg");
        image.display();
        image.display();
    }
}
