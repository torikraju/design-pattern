package com.learnDesignPattern.builder.challenge.drink;

public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 15.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
