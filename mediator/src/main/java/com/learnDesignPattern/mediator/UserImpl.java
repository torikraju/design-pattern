package com.learnDesignPattern.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserImpl extends User {

    private static final Logger logger = LoggerFactory.getLogger(UserImpl.class);


    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        logger.info("{}: Sending Message={}", getName(), message);
        getMediator().sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        logger.info("{}: Received Message={}", getName(), message);
    }
}
