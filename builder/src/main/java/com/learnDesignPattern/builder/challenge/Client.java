package com.learnDesignPattern.builder.challenge;

import com.learnDesignPattern.builder.challenge.concreateBuilder.NonVegMealBuilder;
import com.learnDesignPattern.builder.challenge.concreateBuilder.VegMealBuilder;
import com.learnDesignPattern.builder.challenge.director.Director;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        Director director = new Director();

        MealBuilderInterface vegMealBuilder = new VegMealBuilder();
        MealBuilderInterface nonVegMealBuilder = new NonVegMealBuilder();

        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();
        logger.info("Veg Meal");
        vegMeal.showItems();
        logger.info("Total cost: {}", vegMeal.getCost());


        director.construct(nonVegMealBuilder);
        Meal nonVegMeal = nonVegMealBuilder.getMeal();
        logger.info("Non Veg Meal");
        nonVegMeal.showItems();
        logger.info("Total cost: {}", nonVegMeal.getCost());

    }
}
