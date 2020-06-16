package com.learnDesignPattern.factoryMethod.staticMethodCreator;


import com.learnDesignPattern.factoryMethod.abstractCreator.Shape;
import com.learnDesignPattern.factoryMethod.domain.Circle;
import com.learnDesignPattern.factoryMethod.domain.Rectangle;
import com.learnDesignPattern.factoryMethod.domain.Square;
import com.learnDesignPattern.factoryMethod.enums.ShapeEnum;

public class StaticShapeFactory {


    public static Shape getShape(ShapeEnum shapeType) {

        if (ShapeEnum.CIRCLE.equals(shapeType)) {
            return new Circle();
        } else if (ShapeEnum.RECTANGLE.equals(shapeType)) {
            return new Rectangle();
        } else if (ShapeEnum.SQUARE.equals(shapeType)) {
            return new Square();
        } else {
            return null;
        }
    }


}


