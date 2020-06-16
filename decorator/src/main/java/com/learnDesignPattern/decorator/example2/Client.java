package com.learnDesignPattern.decorator.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        try {
            byte[] bytes = "Torikul Alam".getBytes();
            int c;
            InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes));
            StringBuilder stringBuffer = new StringBuilder();
            while ((c = in.read()) > 0) {
                stringBuffer.append((char) c);
            }
            logger.info(stringBuffer.toString());
            in.close();
        } catch (IOException e) {
            logger.error(Arrays.toString(e.getStackTrace()));
        }
    }

}
