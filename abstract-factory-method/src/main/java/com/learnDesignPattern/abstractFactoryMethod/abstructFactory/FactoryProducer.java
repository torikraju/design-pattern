package com.learnDesignPattern.abstractFactoryMethod.abstructFactory;

import com.learnDesignPattern.abstractFactoryMethod.enums.Choice;

public class FactoryProducer {
    public static AbstractFactory getFactory(Choice choice) throws Exception {
        if (Choice.SHAPE.equals(choice)) {
            return new ShapeFactory();
        } else if (Choice.COLOR.equals(choice)) {
            return new ColorFactory();
        } else throw new Exception("not a valid choice");

    }
}
