package com.learnDesignPattern.abstractFactoryMethod.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) throws Exception {
        MovieFactoryInterface actionMovies = FactoryProducer.getFactory(Choice.ACTION);
        logger.info(actionMovies.getBollyWoodMovie().getMovieName());
        logger.info(actionMovies.getHollyWoodMovie().getMovieName());

        MovieFactoryInterface comedyMovies = FactoryProducer.getFactory(Choice.COMEDY);
        logger.info(comedyMovies.getBollyWoodMovie().getMovieName());
        logger.info(comedyMovies.getHollyWoodMovie().getMovieName());

    }
}
