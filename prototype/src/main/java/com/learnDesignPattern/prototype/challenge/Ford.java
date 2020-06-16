package com.learnDesignPattern.prototype.challenge;

public class Ford extends BasicCar {
    public Ford(String modelName) {
        this.setModelName(modelName);
    }


    public BasicCar clone() {
        return (Ford) super.clone();
    }
}
