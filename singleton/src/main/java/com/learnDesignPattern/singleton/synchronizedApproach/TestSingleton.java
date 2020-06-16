package com.learnDesignPattern.singleton.synchronizedApproach;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSingleton {

    private static final Logger logger = LoggerFactory.getLogger(TestSingleton.class);

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.setData(45);

        logger.info("First reference: " + s);
        logger.info("Singleton data value is: " + s.getData());

        s = null;
        s = Singleton.getInstance();
        logger.info("First reference: " + s);
        logger.info("Singleton data value is: " + s.getData());
    }
}
