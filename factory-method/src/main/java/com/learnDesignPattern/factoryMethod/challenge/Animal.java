package com.learnDesignPattern.factoryMethod.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Animal {
    void speak();
}

class Tiger implements Animal {
    private static final Logger logger = LoggerFactory.getLogger(Tiger.class);

    @Override
    public void speak() {
        logger.info("Tiger says:Halum..Halum");
    }
}

class Duct implements Animal {
    private static final Logger logger = LoggerFactory.getLogger(Duct.class);

    @Override
    public void speak() {
        logger.info("Duct says:Pack-pack");
    }
}
