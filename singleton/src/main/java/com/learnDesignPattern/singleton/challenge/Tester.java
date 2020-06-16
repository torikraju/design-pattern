package com.learnDesignPattern.singleton.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tester {

    private static final Logger logger = LoggerFactory.getLogger(Tester.class);

    public static void main(String[] args) {
        logger.info("***Singleton pattern demo***");
        logger.info("Trying to make a captain for our team");
        MakeOneCaptain captain1 = MakeOneCaptain.getCaptain();
        logger.info("Trying to make another captain for our team");
        MakeOneCaptain captain2 = MakeOneCaptain.getCaptain();
        if (captain1==captain2){
            logger.info("captain1 and captain2 are same");
        }
    }
}
