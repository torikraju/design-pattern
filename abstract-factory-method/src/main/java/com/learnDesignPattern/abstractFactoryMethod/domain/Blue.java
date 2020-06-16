package com.learnDesignPattern.abstractFactoryMethod.domain;

import com.learnDesignPattern.abstractFactoryMethod.common.Color;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Blue implements Color {
    private static final Logger logger = LoggerFactory.getLogger(Blue.class);

    @Override
    public void fill() {
        logger.info("inside Blue:fill()");
    }
}
