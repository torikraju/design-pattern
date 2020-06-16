package com.learnDesignPattern.builder.challenge.wrapper;

import com.learnDesignPattern.builder.challenge.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
