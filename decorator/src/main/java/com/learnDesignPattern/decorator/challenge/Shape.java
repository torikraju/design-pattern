package com.learnDesignPattern.decorator.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Shape {
    void draw();
}

class Rectangle implements Shape {

    private static final Logger logger = LoggerFactory.getLogger(Rectangle.class);

    @Override
    public void draw() {
        logger.info("Shape: Rectangle");
    }
}

class Circle implements Shape {

    private static final Logger logger = LoggerFactory.getLogger(Circle.class);

    @Override
    public void draw() {
        logger.info("Shape: Circle");
    }
}


