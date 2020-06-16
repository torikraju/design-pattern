package com.learnDesignPattern.adapter.objectAdapter.calculatorTriangle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        logger.info("***Adapter pattern demo***");
        Triangle triangle = new Triangle(20, 10);
        CalculatorAdapter calculatorAdapter = new CalculatorAdapter(triangle);
        logger.info("Area of triangle is : " + calculatorAdapter.getArea(null));
    }
}
