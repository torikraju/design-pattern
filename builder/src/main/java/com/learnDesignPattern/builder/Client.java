package com.learnDesignPattern.builder;

import com.learnDesignPattern.builder.domain.Bike;
import com.learnDesignPattern.builder.domain.Car;
import com.learnDesignPattern.builder.domain.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        logger.info("***Builder pattern demo***");
        Director director = new Director();
        BuilderInterface carBuilder = new Car();
        BuilderInterface bikeBuilder = new Bike();

        director.construct(carBuilder);
        Product car = carBuilder.getVehicle();
        car.show();

        director.construct(bikeBuilder);
        Product bike = bikeBuilder.getVehicle();
        bike.show();


    }
}
