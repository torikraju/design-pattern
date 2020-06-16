package com.learnDesignPattern.prototype.challenge;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;

@Data
public abstract class BasicCar implements Cloneable {

    private static final Logger logger = LoggerFactory.getLogger(BasicCar.class);

    private String modelName;
//    @Setter(AccessLevel.NONE)
    private int price;

    public static int setPrice() {
        int price = 0;
        Random r = new Random();
        int p = r.nextInt(100000);
        price = p;
        return price;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = (BasicCar) super.clone();
        } catch (CloneNotSupportedException e) {
            logger.error(Arrays.toString(e.getStackTrace()));
        }
        return clone;
    }
}
