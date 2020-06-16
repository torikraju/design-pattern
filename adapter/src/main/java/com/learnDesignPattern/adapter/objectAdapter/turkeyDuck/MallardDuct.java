package com.learnDesignPattern.adapter.objectAdapter.turkeyDuck;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MallardDuct implements Duck {
    private static final Logger logger = LoggerFactory.getLogger(MallardDuct.class);

    @Override
    public void quack() {
        logger.info("Quack");
    }

    @Override
    public void fly() {
        logger.info("I am flying...");
    }
}
