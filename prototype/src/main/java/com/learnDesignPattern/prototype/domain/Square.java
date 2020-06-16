package com.learnDesignPattern.prototype.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square extends Shape {

    private static final Logger logger = LoggerFactory.getLogger(Square.class);

    public Square() {
        super.setType("Square");
    }

    @Override
    void draw() {
        logger.info("Inside Square::draw() method");
    }
}
