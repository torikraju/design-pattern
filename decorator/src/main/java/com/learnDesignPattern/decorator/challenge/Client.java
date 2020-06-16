package com.learnDesignPattern.decorator.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        logger.info("Circle with normal border");
        circle.draw();

        logger.info("Circle with red border");
        redCircle.draw();

        logger.info("Rectangle with red border");
        redRectangle.draw();


    }
}
