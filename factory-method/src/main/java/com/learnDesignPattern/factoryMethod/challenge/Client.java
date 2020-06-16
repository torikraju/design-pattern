package com.learnDesignPattern.factoryMethod.challenge;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        Animal tiger = new AnimalFactory().getAnimal(AnimalType.TIGER);
        tiger.speak();

        Animal duct = new AnimalFactory().getAnimal(AnimalType.DUCK);
        duct.speak();


    }

}
