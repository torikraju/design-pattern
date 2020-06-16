package com.learnDesignPattern.builder;

import com.learnDesignPattern.builder.domain.Product;

public interface BuilderInterface {
    void buildBody();

    void insetWheels();

    void addHeadLights();

    Product getVehicle();
}
