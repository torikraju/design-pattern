package com.learnDesignPattern.factoryMethod.domain;

import com.learnDesignPattern.factoryMethod.abstractCreator.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Circle implements Shape {
    private static final Logger logger = LoggerFactory.getLogger(Circle.class);

    @Override
    public void draw() {
        logger.info("inside Circle::draw()");
    }
}
