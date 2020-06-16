package com.learnDesignPattern.adapter.objectAdapter.calculatorTriangle;

public class Calculator implements CalculatorInterface {

    private Rectangle rectangle;

    @Override
    public double getArea(Rectangle rectangle) {
        this.rectangle = rectangle;
        return this.rectangle.getLength() * this.rectangle.getWidth();
    }
}
