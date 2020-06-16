package com.learnDesignPattern.builder.challenge.burger;

import com.learnDesignPattern.builder.challenge.Item;
import com.learnDesignPattern.builder.challenge.Packing;
import com.learnDesignPattern.builder.challenge.wrapper.Wrapper;

abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
