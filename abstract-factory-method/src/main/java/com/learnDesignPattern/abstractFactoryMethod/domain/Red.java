package com.learnDesignPattern.abstractFactoryMethod.domain;

import com.learnDesignPattern.abstractFactoryMethod.common.Color;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Red implements Color {
    private static final Logger logger = LoggerFactory.getLogger(Red.class);

    @Override
    public void fill() {
        logger.info("inside Red:fill()");
    }
}
