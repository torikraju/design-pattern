package com.learnDesignPattern.abstractFactoryMethod.abstructFactory;

import com.learnDesignPattern.abstractFactoryMethod.common.Color;
import com.learnDesignPattern.abstractFactoryMethod.common.Shape;
import com.learnDesignPattern.abstractFactoryMethod.domain.Circle;
import com.learnDesignPattern.abstractFactoryMethod.domain.Rectangle;
import com.learnDesignPattern.abstractFactoryMethod.domain.Square;
import com.learnDesignPattern.abstractFactoryMethod.enums.ColorName;
import com.learnDesignPattern.abstractFactoryMethod.enums.ShapeType;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(ColorName colorName) throws Exception {
        throw new Exception("this method is no callable");
    }

    @Override
    public Shape getShape(ShapeType shapeType) throws Exception {
        if (ShapeType.CIRCLE.equals(shapeType)) {
            return new Circle();
        } else if (ShapeType.RECTANGLE.equals(shapeType)) {
            return new Rectangle();
        } else if (ShapeType.SQUARE.equals(shapeType)) {
            return new Square();
        } else {
            throw new Exception("No Shape found");
        }
    }
}
