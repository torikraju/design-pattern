package com.learnDesignPattern.interpreter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);
    public InterpreterContext interpreterContext;

    public Client(InterpreterContext interpreterContext) {
        this.interpreterContext = interpreterContext;
    }

    public String interpret(String str) {
        Expression exp = null;

        int i = Integer.parseInt(str.substring(0, str.indexOf(" ")));
        if (str.contains("Hexadecimal")) {
            exp = new IntoHexExpression(i);
        } else if (str.contains("Binary")) {
            exp = new IntoBinaryExpression(i);
        } else
            return str;

        return exp.interpreter(interpreterContext);
    }

    public static void main(String[] args) {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        Client ec = new Client(new InterpreterContext());
        logger.info("{} = {}", str1, ec.interpret(str1));
        logger.info("{} = {}", str2, ec.interpret(str2));
    }
}
