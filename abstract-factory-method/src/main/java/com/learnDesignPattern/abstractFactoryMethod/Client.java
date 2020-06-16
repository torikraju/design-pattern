package com.learnDesignPattern.abstractFactoryMethod;

import com.learnDesignPattern.abstractFactoryMethod.abstructFactory.AbstractFactory;
import com.learnDesignPattern.abstractFactoryMethod.abstructFactory.FactoryProducer;
import com.learnDesignPattern.abstractFactoryMethod.common.Color;
import com.learnDesignPattern.abstractFactoryMethod.common.Shape;
import com.learnDesignPattern.abstractFactoryMethod.enums.Choice;
import com.learnDesignPattern.abstractFactoryMethod.enums.ColorName;
import com.learnDesignPattern.abstractFactoryMethod.enums.ShapeType;

public class Client {
    public static void main(String[] args) throws Exception {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(Choice.SHAPE);
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory(Choice.COLOR);
        Color red = colorFactory.getColor(ColorName.RED);
        red.fill();

    }
}
