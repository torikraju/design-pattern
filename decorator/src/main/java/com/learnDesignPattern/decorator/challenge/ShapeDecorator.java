package com.learnDesignPattern.decorator.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}

class RedShapeDecorator extends ShapeDecorator {

    private static final Logger logger = LoggerFactory.getLogger(RedShapeDecorator.class);

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBoarder(shape);
    }

    private void setRedBoarder(Shape shape) {
        logger.info("Border Color: Red");
    }
}
