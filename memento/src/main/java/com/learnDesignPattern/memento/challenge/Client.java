package com.learnDesignPattern.memento.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        logger.info("Current State: {}", originator.getState());

        originator.getStateFromMemento(caretaker.get(0));
        logger.info("Current State: {}", originator.getState());

        originator.getStateFromMemento(caretaker.get(1));
        logger.info("Current State: {}", originator.getState());

    }
}
