package com.learnDesignPattern.builder.challenge.burger;

public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 60.0f;
    }

    @Override
    public String name() {
        return "Chicken burger";
    }
}
