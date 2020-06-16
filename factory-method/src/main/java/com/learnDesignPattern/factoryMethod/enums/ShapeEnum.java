package com.learnDesignPattern.factoryMethod.enums;

public enum ShapeEnum {
    CIRCLE("CIRCLE"),
    RECTANGLE("RECTANGLE"),
    SQUARE("SQUARE");

    private String shapeType;

    ShapeEnum(String shapeType) {
        this.shapeType = shapeType;
    }

    public String getShape() {
        return shapeType;
    }
}
