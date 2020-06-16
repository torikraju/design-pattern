package com.learnDesignPattern.bridge.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        logger.info("***Bridge pattern***");

        //all color
        Color green = new Green();
        Color red = new Red();

        // coloring Green to Triangle
        logger.info("Coloring Triangle");
        Shape triangleGreen = new Triangle(green);
        triangleGreen.drawShape(20);
        triangleGreen.modifyBorder(20, 3);

        // coloring Red to Triangle
        logger.info("Coloring Triangle");
        Shape triangleRed = new Triangle(red);
        triangleRed.drawShape(30);
        triangleRed.modifyBorder(30, 6);

    }
}
