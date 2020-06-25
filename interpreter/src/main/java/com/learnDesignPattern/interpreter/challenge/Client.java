package com.learnDesignPattern.interpreter.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new OrExpression(julie, married);
    }


    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWomen = getMarriedWomanExpression();

        Context ic = new Context("John");
        logger.info("John is male ? {}", isMale.interpret(ic));


        Context ic2 = new Context("Married Julie");
        logger.info("Julie is married women ? {}", isMarriedWomen.interpret(ic2));

        Context ic3 = new Context("Lucy");
        logger.info("Lucy is male ? {}", isMale.interpret(ic3));


    }
}
