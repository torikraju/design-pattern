package com.learnDesignPattern.composite.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        Employee springDev = new Developer("Triss Merigold", "EMP001", "spring-developer");
        Employee androidDev = new Developer("Alice Quinn", "EMP002", "android-developer");

        Manager javaManager = new Manager("Blelemi Blake", 50000.00);
        javaManager.addEmployees(springDev, androidDev);

        Employee laravelDev = new Developer("Roderick J Johnson", "EMP002", "laravel-developer");
        Manager generalManager = new Manager("Carlos K Padgett", 150000.00);
        generalManager.addEmployees(laravelDev, javaManager);
        generalManager.showEmployeeDetails();

    }
}
