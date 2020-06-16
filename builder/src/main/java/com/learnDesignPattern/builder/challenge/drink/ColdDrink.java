package com.learnDesignPattern.builder.challenge.drink;

import com.learnDesignPattern.builder.challenge.Item;
import com.learnDesignPattern.builder.challenge.Packing;
import com.learnDesignPattern.builder.challenge.wrapper.Bottle;

abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
