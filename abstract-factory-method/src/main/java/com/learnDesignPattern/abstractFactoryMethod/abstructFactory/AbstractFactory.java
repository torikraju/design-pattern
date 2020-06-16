package com.learnDesignPattern.abstractFactoryMethod.abstructFactory;

import com.learnDesignPattern.abstractFactoryMethod.common.Color;
import com.learnDesignPattern.abstractFactoryMethod.common.Shape;
import com.learnDesignPattern.abstractFactoryMethod.enums.ColorName;
import com.learnDesignPattern.abstractFactoryMethod.enums.ShapeType;

public abstract class AbstractFactory {

    public abstract Color getColor(ColorName colorName) throws Exception;

    public abstract Shape getShape(ShapeType shapeType) throws Exception;

}
