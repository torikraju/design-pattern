package com.learnDesignPattern.adapter.classAdapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        logger.info("***Class adapter demo***");
        ClassAdapter classAdapter = new ClassAdapter();
        logger.info("Class adapter result: " + classAdapter.getInteger());

        logger.info("***Object adapter demo***");
        ObjectAdapter objectAdapter = new ObjectAdapter(new IntegerValue());
        logger.info("Object adapter result: " + objectAdapter.getInteger());

    }

}
