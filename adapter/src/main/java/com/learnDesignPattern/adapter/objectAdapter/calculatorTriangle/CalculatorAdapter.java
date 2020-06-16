package com.learnDesignPattern.adapter.objectAdapter.calculatorTriangle;

public class CalculatorAdapter implements CalculatorInterface {

    private Calculator calculator;
    private Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle rectangle) {
        calculator = new Calculator();
        Rectangle r = new Rectangle();
        r.setLength(triangle.getBase());
        r.setWidth(0.5 * triangle.getHeight());
        return calculator.getArea(r);
    }
}
