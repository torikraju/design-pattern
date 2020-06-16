package com.learnDesignPattern.prototype.challenge;

public class Nano extends BasicCar {
    public Nano(String modelName) {
        this.setModelName(modelName);
    }


    public BasicCar clone() {
        return (Nano) super.clone();
    }
}
