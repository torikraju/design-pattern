package com.learnDesignPattern.adapter.objectAdapter.turkeyDuck;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WildTurkey implements Turkey {

    private static final Logger logger = LoggerFactory.getLogger(WildTurkey.class);

    @Override
    public void gobble() {
        logger.info("Gobble Gobble");
    }

    @Override
    public void fly() {
        logger.info("I am a flying a short distance");
    }
}
