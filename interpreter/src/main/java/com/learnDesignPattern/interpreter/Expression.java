package com.learnDesignPattern.interpreter;

public interface Expression {
    String interpreter(InterpreterContext interpreterContext);
}

class IntoBinaryExpression implements Expression {

    private int i;

    public IntoBinaryExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpreter(InterpreterContext interpreterContext) {
        return interpreterContext.getBinaryFormat(i);
    }
}

class IntoHexExpression implements Expression {

    private int i;

    public IntoHexExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpreter(InterpreterContext interpreterContext) {
        return interpreterContext.getHexadecimalFormat(i);
    }
}
