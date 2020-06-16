package com.learnDesignPattern.builder.challenge.concreateBuilder;

import com.learnDesignPattern.builder.challenge.Meal;
import com.learnDesignPattern.builder.challenge.MealBuilderInterface;
import com.learnDesignPattern.builder.challenge.burger.VegBurger;
import com.learnDesignPattern.builder.challenge.drink.Coke;

public class VegMealBuilder implements MealBuilderInterface {

    private Meal vegMeal = new Meal();

    @Override
    public void buildBurger() {
        vegMeal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        vegMeal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return this.vegMeal;
    }
}
