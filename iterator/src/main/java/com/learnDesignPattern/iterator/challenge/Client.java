package com.learnDesignPattern.iterator.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void print(IteratorInterface iterator) {
        while (!iterator.isDone()) {
            logger.info(iterator.next());
        }
    }

    public static void main(String[] args) {
        logger.info("***Iterator Pattern Demo***");
        SubjectInterface scienceSubject = new Science();
        SubjectInterface artsSubject = new Arts();

        IteratorInterface scienceIterator = scienceSubject.createIterator();
        IteratorInterface artsIterator = artsSubject.createIterator();

        print(scienceIterator);
        print(artsIterator);


    }
}
