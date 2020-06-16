package com.learnDesignPattern.prototype.domain;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

@Data
public abstract class Shape implements Cloneable {
    private static final Logger logger = LoggerFactory.getLogger(Shape.class);

    private String id;
    private String type;

    abstract void draw();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            logger.error(Arrays.toString(e.getStackTrace()));
        }
        return clone;
    }
}
