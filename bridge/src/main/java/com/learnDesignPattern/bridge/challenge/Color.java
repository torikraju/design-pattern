package com.learnDesignPattern.bridge.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Color {
    void fillWithColor(int border);
}

class Red implements Color {

    private static final Logger logger = LoggerFactory.getLogger(Red.class);

    @Override
    public void fillWithColor(int border) {
        logger.info("Red color with {} inch border", border);
    }
}

class Green implements Color {

    private static final Logger logger = LoggerFactory.getLogger(Green.class);

    @Override
    public void fillWithColor(int border) {
        logger.info("Green color with {} inch border", border);
    }
}



