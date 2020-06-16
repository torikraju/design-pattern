package com.learnDesignPattern.composite.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        Employee dev1 = new Developer("Triss Merigold", "EMP001", "pro-developer");
        Employee dev2 = new Developer("Alice Quinn", "EMP002", "entry-level-developer");

        Directory engDir = new Directory();
        engDir.addEmployee(dev1);
        engDir.addEmployee(dev2);

        Employee man1 = new Manager("Blelemi Blake", "EMP003", "seo-manager");
        Employee man2 = new Manager("Echo", "EMP004", "new-manager");

        Directory accDir = new Directory();
        accDir.addEmployee(man1);
        accDir.addEmployee(man2);


        Directory comDir = new Directory();
        comDir.addEmployee(engDir);
        comDir.addEmployee(accDir);

        comDir.showEmployeeDetails();


    }
}
