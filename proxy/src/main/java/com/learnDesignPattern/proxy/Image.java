package com.learnDesignPattern.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Image {
    void display();
}

class RealImage implements Image {

    private static final Logger logger = LoggerFactory.getLogger(RealImage.class);

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        logger.info("Loading...{}", fileName);
    }

    @Override
    public void display() {
        logger.info("Displaying {}", fileName);
    }
}
