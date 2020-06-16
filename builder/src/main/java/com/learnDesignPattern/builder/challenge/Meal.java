package com.learnDesignPattern.builder.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private static final Logger logger = LoggerFactory.getLogger(Meal.class);

    private List<Item> items;

    public Meal() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : this.items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        this.items.forEach(el -> {
            logger.info("Item: {}", el.name());
            logger.info("Packing: {}", el.packing().pack());
            logger.info("price: {}", el.price());
        });
    }

}
