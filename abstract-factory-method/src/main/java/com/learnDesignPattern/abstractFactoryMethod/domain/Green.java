package com.learnDesignPattern.abstractFactoryMethod.domain;

import com.learnDesignPattern.abstractFactoryMethod.common.Color;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Green implements Color {
    private static final Logger logger = LoggerFactory.getLogger(Green.class);

    @Override
    public void fill() {
        logger.info("inside Green:fill()");
    }
}
