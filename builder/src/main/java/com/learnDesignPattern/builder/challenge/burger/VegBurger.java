package com.learnDesignPattern.builder.challenge.burger;

public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Vegetable burger";
    }
}
