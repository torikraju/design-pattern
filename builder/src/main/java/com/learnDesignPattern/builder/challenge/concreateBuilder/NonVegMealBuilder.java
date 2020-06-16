package com.learnDesignPattern.builder.challenge.concreateBuilder;

import com.learnDesignPattern.builder.challenge.Meal;
import com.learnDesignPattern.builder.challenge.MealBuilderInterface;
import com.learnDesignPattern.builder.challenge.burger.ChickenBurger;
import com.learnDesignPattern.builder.challenge.drink.Pepsi;

public class NonVegMealBuilder implements MealBuilderInterface {

    private Meal nonVegMeal = new Meal();

    @Override
    public void buildBurger() {
        nonVegMeal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        nonVegMeal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return this.nonVegMeal;
    }
}
