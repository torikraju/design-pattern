package com.learnDesignPattern.bridge;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
public abstract class Vehicle {
    private Workshop workshop1;
    private Workshop workshop2;

    public Vehicle(Workshop workshop1, Workshop workshop2) {
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    public abstract void manufacture();
}

class Car extends Vehicle {
    private static final Logger logger = LoggerFactory.getLogger(Car.class);

    public Car(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        logger.info("Car");
        getWorkshop1().work();
        getWorkshop2().work();
    }
}

class Bike extends Vehicle {
    private static final Logger logger = LoggerFactory.getLogger(Bike.class);

    public Bike(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        logger.info("Bike");
        getWorkshop1().work();
        getWorkshop2().work();
    }
}



