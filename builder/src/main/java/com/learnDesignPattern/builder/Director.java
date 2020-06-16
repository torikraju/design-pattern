package com.learnDesignPattern.builder;

public class Director {
    BuilderInterface myBuilderInterface;

    public void construct(BuilderInterface builder) {
        this.myBuilderInterface = builder;
        myBuilderInterface.buildBody();
        myBuilderInterface.insetWheels();
        myBuilderInterface.addHeadLights();
    }

}
