package com.learnDesignPattern.abstractFactoryMethod.domain;


import com.learnDesignPattern.abstractFactoryMethod.common.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle implements Shape {
    private static final Logger logger = LoggerFactory.getLogger(Rectangle.class);

    @Override
    public void draw() {
        logger.info("inside Rectangle::draw()");
    }
}
