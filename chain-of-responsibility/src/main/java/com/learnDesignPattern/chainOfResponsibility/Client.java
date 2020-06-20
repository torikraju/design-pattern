package com.learnDesignPattern.chainOfResponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    private DispenseChain c1;

    public Client() {
        this.c1 = new Dollar50Dispense();
        DispenseChain c2 = new Dollar20Dispense();
        DispenseChain c3 = new Dollar10Dispense();

        c1.setNextChain(c2);
        c2.setNextChain(c3);

    }

    public static void main(String[] args) {
        Client atmDispenser = new Client();

        while (true) {
            int amount = 0;
            logger.info("Enter the amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if (amount % 10 != 0) {
                logger.info("amount should be in multiple of 10s");
                return;
            }

            atmDispenser.c1.dispense(new Currency(amount));


        }

    }
}
