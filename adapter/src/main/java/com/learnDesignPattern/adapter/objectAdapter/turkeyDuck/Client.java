package com.learnDesignPattern.adapter.objectAdapter.turkeyDuck;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        MallardDuct duck = new MallardDuct();
        WildTurkey turkey = new WildTurkey();

        logger.info("The turkey says...");
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        turkey.gobble();
        turkey.fly();


        logger.info("The duck says...");
        testDuct(duck);

        logger.info("TurkeyAdapter says...");
        testDuct(turkeyAdapter);

    }


    static void testDuct(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
