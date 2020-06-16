package com.learnDesignPattern.prototype.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        logger.info("***Prototype Pattern Demo***");

        BasicCarCache.loadCache();

        BasicCar nanoCar = BasicCarCache.getCar("Green Nano");
        nanoCar.setPrice(nanoCar.getPrice() + Nano.setPrice());
        logger.info("Car is: {} and its price is {}", nanoCar.getModelName(), nanoCar.getPrice());

        BasicCar fordCar = BasicCarCache.getCar("Yellow Ford");
        fordCar.setPrice(fordCar.getPrice() + Ford.setPrice());
        logger.info("Car is: {} and its price is {}", fordCar.getModelName(), fordCar.getPrice());

    }
}
