package com.learnDesignPattern.command.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Stock {

    private static final Logger logger = LoggerFactory.getLogger(Stock.class);

    private final String name = "google";
    private final int quantity = 1000;

    public void buy() {
        logger.info("Stock [name: {}, quantity:{} bought]", name, quantity);
    }

    public void sell() {
        logger.info("Stock [name: {}, quantity:{} sold]", name, quantity);
    }


}
