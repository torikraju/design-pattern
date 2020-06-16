package com.learnDesignPattern.bridge.challenge;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void drawShape(int border);

    public abstract void modifyBorder(int border, int increment);

}

class Triangle extends Shape {

    private static final Logger logger = LoggerFactory.getLogger(Rectangle.class);

    public Triangle(Color color) {
        super(color);
    }

    // implementer-specific method
    @Override
    public void drawShape(int border) {
        logger.info("This Triangle is colored with ");
        getColor().fillWithColor(border);
    }

    // abstraction-specific method
    @Override
    public void modifyBorder(int border, int increment) {
        logger.info("Now we are changing the border length {} times", increment);
        border = border * increment;
        drawShape(border);
    }
}

class Rectangle extends Shape {

    private static final Logger logger = LoggerFactory.getLogger(Rectangle.class);

    public Rectangle(Color color) {
        super(color);
    }

    // implementer-specific method
    @Override
    public void drawShape(int border) {
        logger.info("This Rectangle is colored with ");
        getColor().fillWithColor(border);
    }

    // abstraction-specific method
    @Override
    public void modifyBorder(int border, int increment) {
        logger.info("Now we are changing the border length {} times", increment);
        border = border * increment;
        drawShape(border);
    }
}




