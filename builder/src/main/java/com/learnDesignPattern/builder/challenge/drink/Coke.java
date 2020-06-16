package com.learnDesignPattern.builder.challenge.drink;

public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 20.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
