package com.learnDesignPattern.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        FileWriterCaretaker fileWriterCaretaker = new FileWriterCaretaker();
        FileWriterUtil fileWriterUtil = new FileWriterUtil("data.txt");
        fileWriterUtil.write("First set of Data: Myra Lucy");
        logger.info(fileWriterUtil.toString());

        fileWriterCaretaker.save(fileWriterUtil);

        fileWriterUtil.write(" Second set of Data: Jason");
        logger.info(fileWriterUtil.toString());

        fileWriterCaretaker.undo(fileWriterUtil);
        logger.info(fileWriterUtil.toString());


    }
}
