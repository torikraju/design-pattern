package com.learnDesignPattern.abstractFactoryMethod.abstructFactory;

import com.learnDesignPattern.abstractFactoryMethod.common.Color;
import com.learnDesignPattern.abstractFactoryMethod.common.Shape;
import com.learnDesignPattern.abstractFactoryMethod.domain.Blue;
import com.learnDesignPattern.abstractFactoryMethod.domain.Green;
import com.learnDesignPattern.abstractFactoryMethod.domain.Red;
import com.learnDesignPattern.abstractFactoryMethod.enums.ColorName;
import com.learnDesignPattern.abstractFactoryMethod.enums.ShapeType;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(ColorName colorName) throws Exception {

        if (ColorName.RED.equals(colorName)) {
            return new Red();
        } else if (ColorName.GREEN.equals(colorName)) {
            return new Green();
        } else if (ColorName.BLUE.equals(colorName)) {
            return new Blue();
        } else {
            throw new Exception("No Color found");
        }
    }

    @Override
    public Shape getShape(ShapeType shapeType) throws Exception {
        throw new Exception("this method is no callable");
    }
}
