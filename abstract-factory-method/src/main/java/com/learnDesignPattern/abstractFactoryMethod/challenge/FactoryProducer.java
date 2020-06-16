package com.learnDesignPattern.abstractFactoryMethod.challenge;

public class FactoryProducer {

    public static MovieFactoryInterface getFactory(Choice choice) throws Exception {
        if (Choice.COMEDY.equals(choice)) {
            return new ComedyMovieFactory();
        } else if (Choice.ACTION.equals(choice)) {
            return new ActionMovieFactory();
        } else throw new Exception("not a valid choice");
    }

}
