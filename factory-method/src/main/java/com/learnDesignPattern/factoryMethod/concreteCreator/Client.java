package com.learnDesignPattern.factoryMethod.concreteCreator;


import com.learnDesignPattern.factoryMethod.abstractCreator.Shape;
import com.learnDesignPattern.factoryMethod.enums.ShapeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        Shape circle = new ShapeFactory().getShape(ShapeEnum.CIRCLE);
        circle.draw();

        Shape rectangle = new ShapeFactory().getShape(ShapeEnum.RECTANGLE);
        rectangle.draw();

        Shape square = new ShapeFactory().getShape(ShapeEnum.SQUARE);
        square.draw();

    }

}
