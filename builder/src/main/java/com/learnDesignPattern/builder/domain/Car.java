package com.learnDesignPattern.builder.domain;

import com.learnDesignPattern.builder.BuilderInterface;

public class Car implements BuilderInterface {

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("this is a body of car");
    }

    @Override
    public void insetWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("2 headlights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
