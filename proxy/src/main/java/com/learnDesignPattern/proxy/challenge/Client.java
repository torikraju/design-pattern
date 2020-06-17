package com.learnDesignPattern.proxy.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {

        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("google.com");
            internet.connectTo("facebook.com");
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }
}
