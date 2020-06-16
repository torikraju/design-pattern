package com.learnDesignPattern.prototype;

import com.learnDesignPattern.prototype.cached.ShapeCache;
import com.learnDesignPattern.prototype.domain.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShapeCircle = ShapeCache.getShape("1");
        logger.info("Shape: {}", cloneShapeCircle.getType());

        Shape cloneShapeSquare = ShapeCache.getShape("2");
        logger.info("Shape: {}", cloneShapeSquare.getType());

        Shape cloneShapeRectangle = ShapeCache.getShape("3");
        logger.info("Shape: {}", cloneShapeRectangle.getType());

    }
}
