package com.learnDesignPattern.builder.challenge.wrapper;

import com.learnDesignPattern.builder.challenge.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
