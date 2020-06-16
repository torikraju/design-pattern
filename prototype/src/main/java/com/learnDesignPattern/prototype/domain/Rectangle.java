package com.learnDesignPattern.prototype.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle extends Shape {

    private static final Logger logger = LoggerFactory.getLogger(Rectangle.class);

    public Rectangle() {
        super.setType("Rectangle");
    }

    @Override
    void draw() {
        logger.info("Inside Rectangle::draw() method");
    }
}
