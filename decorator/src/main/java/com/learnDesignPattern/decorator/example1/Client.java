package com.learnDesignPattern.decorator.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        logger.info("***Decorator pattern demo***");
        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecoratorEx1 cd1 = new ConcreteDecoratorEx1();

        cd1.setComponent(cc);
        cd1.doJob();

        ConcreteDecoratorEx2 cd2 = new ConcreteDecoratorEx2();
        cd2.setComponent(cd1);
        cd2.doJob();
    }
}
