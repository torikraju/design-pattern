package com.learnDesignPattern.flyweight.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Player {
    void assignWeapon(String weapon);

    void mission();
}

class Terrorist implements Player {

    private static final Logger logger = LoggerFactory.getLogger(Terrorist.class);

    private final String task;
    private String weapon;

    public Terrorist() {
        this.task = "plant a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        logger.info("terrorist with weapon {} : task is {}", weapon, task);
    }
}
class AntiTerrorist implements Player {

    private static final Logger logger = LoggerFactory.getLogger(AntiTerrorist.class);

    private final String task;
    private String weapon;

    public AntiTerrorist() {
        this.task = "defuse a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        logger.info("anti terrorist with weapon {} : task is {}", weapon, task);
    }
}

