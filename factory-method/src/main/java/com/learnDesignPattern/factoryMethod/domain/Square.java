package com.learnDesignPattern.factoryMethod.domain;

import com.learnDesignPattern.factoryMethod.abstractCreator.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square implements Shape {
    private static final Logger logger = LoggerFactory.getLogger(Square.class);

    @Override
    public void draw() {
        logger.info("inside Square::draw()");
    }
}
