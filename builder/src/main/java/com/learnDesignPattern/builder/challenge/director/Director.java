package com.learnDesignPattern.builder.challenge.director;

import com.learnDesignPattern.builder.challenge.MealBuilderInterface;

public class Director {
    MealBuilderInterface myBuilder;

    public void construct(MealBuilderInterface builder) {
        myBuilder = builder;
        myBuilder.buildBurger();
        myBuilder.buildDrink();
    }

}
