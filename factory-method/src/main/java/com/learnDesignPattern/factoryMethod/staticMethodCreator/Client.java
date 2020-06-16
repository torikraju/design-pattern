package com.learnDesignPattern.factoryMethod.staticMethodCreator;


import com.learnDesignPattern.factoryMethod.abstractCreator.Shape;
import com.learnDesignPattern.factoryMethod.enums.ShapeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        Shape circle = StaticShapeFactory.getShape(ShapeEnum.CIRCLE);
        Objects.requireNonNull(circle).draw();

        Shape rectangle = StaticShapeFactory.getShape(ShapeEnum.RECTANGLE);
        Objects.requireNonNull(rectangle).draw();

        Shape square = StaticShapeFactory.getShape(ShapeEnum.SQUARE);
        Objects.requireNonNull(square).draw();

    }

}
