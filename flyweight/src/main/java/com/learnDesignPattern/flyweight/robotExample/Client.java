package com.learnDesignPattern.flyweight.robotExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) throws Exception {
        logger.info("***Flyweight pattern example***");
        RobotFactory robotFactory = new RobotFactory();


        RobotInterface shape = null;

        for (int i = 0; i < 3; i++) {
            shape = robotFactory.getRobotFromFactory("king");
            shape.setColor(getRandomColor());
            shape.print();
        }
        for (int i = 0; i < 5; i++) {
            shape = robotFactory.getRobotFromFactory("queen");
            shape.setColor(getRandomColor());
            shape.print();
        }


        int numOfDistinctRobots = robotFactory.totalObjectCreated();
        logger.info("finally number of distinct robot objects is crated: {}", numOfDistinctRobots);


    }

    static String getRandomColor() {
        Random r = new Random();
        int random = r.nextInt(20);
        if (random % 2 == 0) {
            return "red";
        } else {
            return "green";
        }
    }

}
