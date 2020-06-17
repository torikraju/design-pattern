package com.learnDesignPattern.proxy.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {

    private static final Logger logger = LoggerFactory.getLogger(PlayerFactory.class);

    private static final Map<String, Player> hm = new HashMap<>();

    public static Player getPlayer(String type) {
        Player p = null;
        if (hm.containsKey(type)) {
            p = hm.get(type);
        } else {
            switch (type) {
                case ("terrorist"):
                    logger.info("terrorist created");
                    p = new Terrorist();
                    break;
                case "antiTerrorist":
                    logger.info("anti terrorist created");
                    p = new AntiTerrorist();
                    break;
                default:
                    logger.info("unreachable player");
            }
            hm.put(type, p);
        }
        return p;
    }


}
