package com.learnDesignPattern.flyweight.robotExample;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface RobotInterface {
    void print();

    void setColor(String colorOfRobot);
}


@Data
class Robot implements RobotInterface {

    private static final Logger logger = LoggerFactory.getLogger(Robot.class);

    private String robotType;
    private String colorOfRobot;

    public Robot(String robotType) {
        this.robotType = robotType;
    }

    @Override
    public void print() {
        logger.info("This is {} type robot with {} color", robotType, colorOfRobot);
    }

    @Override
    public void setColor(String colorOfRobot) {
        this.colorOfRobot = colorOfRobot;
    }
}
