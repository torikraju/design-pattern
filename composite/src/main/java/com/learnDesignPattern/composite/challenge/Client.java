package com.learnDesignPattern.composite.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        Supervisor techDean = new Supervisor("Kathy A Reed", "Dean of technology");
        Supervisor charOfMath = new Supervisor("Maria J McClellan", "Chairman of mathematics");
        Supervisor charOfCS = new Supervisor("Joseph N Robinson", "Chairman of CS");

        Professor mathProfessor1 = new Professor("William J Rivera", "Adjunct", "302");
        Professor mathProfessor2 = new Professor("Lillian A Lamm", "Associate", "303");


        Professor cseProfessor1 = new Professor("Cecelia R Booth", "Adjunct", "507");
        Professor cseProfessor2 = new Professor("Darrell D Gray", "Professor", "508");
        Professor cseProfessor3 = new Professor("Gregory P McKnight", "Professor", "509");

        techDean.add(charOfMath, charOfCS);

        charOfMath.add(mathProfessor1, mathProfessor2);
        charOfCS.add(cseProfessor1, cseProfessor2, cseProfessor3);

        logger.info("***COMPOSITE PATTERN DEMO***");
        logger.info("The college has the following structure");

        logger.info(techDean.getDetails());
        List<Faculty> chairs = techDean.getFacultyList();
        chairs.forEach(el -> {
            logger.info("\t" + el.getDetails());
        });
        charOfMath.getFacultyList().forEach(el -> logger.info("\t\t" + el.getDetails()));
        charOfCS.getFacultyList().forEach(el -> logger.info("\t\t" + el.getDetails()));

        charOfCS.remove(cseProfessor2);
        logger.info("After cseProfessor2  leaving organisation -CSE department has the following faculty");
        charOfCS.getFacultyList().forEach(el -> logger.info("\t\t" + el.getDetails()));

    }
}
