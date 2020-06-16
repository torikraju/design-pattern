package com.learnDesignPattern.flyweight.challenge;

import java.util.Random;

public class Client {

    private static String[] playerType = {"terrorist", "antiTerrorist"};
    private static String[] weapon = {"AKM", "SKS", "AWM", "M416", "UZI"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Player p = PlayerFactory.getPlayer(getRandomPlayer());
            p.assignWeapon(getRandomWeapon());
            p.mission();
        }

    }

    private static String getRandomWeapon() {
        Random r = new Random();
        int randInt = r.nextInt(weapon.length);
        return weapon[randInt];
    }

    private static String getRandomPlayer() {
        Random r = new Random();
        int randInt = r.nextInt(playerType.length);
        return playerType[randInt];
    }
}
