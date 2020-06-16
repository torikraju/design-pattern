package com.learnDesignPattern.prototype.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Circle extends Shape {

    private static final Logger logger = LoggerFactory.getLogger(Circle.class);

    public Circle() {
        super.setType("Circle");
    }

    @Override
    void draw() {
        logger.info("Inside Circle::draw() method");
    }
}
