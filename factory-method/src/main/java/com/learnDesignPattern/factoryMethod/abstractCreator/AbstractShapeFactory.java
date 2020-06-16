package com.learnDesignPattern.factoryMethod.abstractCreator;


import com.learnDesignPattern.factoryMethod.domain.Circle;
import com.learnDesignPattern.factoryMethod.domain.Rectangle;
import com.learnDesignPattern.factoryMethod.domain.Square;

public abstract class AbstractShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }


}


class CircleFactory extends AbstractShapeFactory {

    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}

class RectangleFactory extends AbstractShapeFactory {

    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}

class SquareFactory extends AbstractShapeFactory {

    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}
