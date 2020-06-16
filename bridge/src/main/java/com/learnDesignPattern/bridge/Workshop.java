package com.learnDesignPattern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Workshop {
    public abstract void work();
}

class Produce extends Workshop {

    private static final Logger logger = LoggerFactory.getLogger(Produce.class);

    @Override
    public void work() {
        logger.info("Produced");
    }
}

class Assemble extends Workshop {

    private static final Logger logger = LoggerFactory.getLogger(Assemble.class);

    @Override
    public void work() {
        logger.info("Assembled");
    }
}
