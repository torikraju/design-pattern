package com.learnDesignPattern.prototype.challenge;

import java.util.Hashtable;

public class BasicCarCache {
    private static Hashtable<String, BasicCar> basicCarMap = new Hashtable<>();

    public static BasicCar getCar(String carName) {
        return basicCarMap.get(carName);
    }

    public static void loadCache() {
        BasicCar nanoCar = new Nano("Green Nano");
        nanoCar.setPrice(10000);
        basicCarMap.put("Green Nano", nanoCar);

        BasicCar fordCar = new Nano("Yellow Ford");
        fordCar.setPrice(50000);
        basicCarMap.put("Yellow Ford", fordCar);
    }

}
