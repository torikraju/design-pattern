package com.learnDesignPattern.builder.challenge;


import com.learnDesignPattern.builder.challenge.burger.VegBurger;
import com.learnDesignPattern.builder.challenge.drink.Coke;

public interface MealBuilderInterface {
    void buildBurger();

    void buildDrink();

    Meal getMeal();
}


