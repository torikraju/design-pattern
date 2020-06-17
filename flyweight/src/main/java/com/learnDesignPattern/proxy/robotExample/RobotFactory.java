package com.learnDesignPattern.proxy.robotExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

    private static final Logger logger = LoggerFactory.getLogger(RobotFactory.class);

    Map<String, RobotInterface> shapes = new HashMap<>();


    public int totalObjectCreated() {
        return this.shapes.size();
    }

    public RobotInterface getRobotFromFactory(String robotType) throws Exception {
        RobotInterface result = null;
        if (shapes.containsKey(robotType)) {
            result = shapes.get(robotType);
        } else {
            switch (robotType) {
                case "king":
                    logger.info("we do not have a king robot. So we are crating a king robot");
                    result = new Robot("king");
                    shapes.put("king", result);
                    break;
                case "queen":
                    logger.info("we do not have have a queen robot. So we are crating a queen robot");
                    result = new Robot("queen");
                    shapes.put("queen", result);
                    break;
                default:
                    throw new Exception("we only create king and queen robot");
            }
        }
        return result;
    }


}
