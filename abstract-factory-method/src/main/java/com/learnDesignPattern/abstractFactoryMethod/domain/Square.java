package com.learnDesignPattern.abstractFactoryMethod.domain;


import com.learnDesignPattern.abstractFactoryMethod.common.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square implements Shape {
    private static final Logger logger = LoggerFactory.getLogger(Square.class);

    @Override
    public void draw() {
        logger.info("inside Square::draw()");
    }
}
