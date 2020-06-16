package com.learnDesignPattern.builder.domain;

import com.learnDesignPattern.builder.BuilderInterface;

public class Bike implements BuilderInterface {

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("this is a body of bike");
    }

    @Override
    public void insetWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("1 headlight are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
