package com.learnDesignPattern.chainOfResponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface DispenseChain {
    void setNextChain(DispenseChain chain);

    void dispense(Currency currency);
}


class Dollar50Dispense implements DispenseChain {

    private static final Logger logger = LoggerFactory.getLogger(Dollar50Dispense.class);

    private DispenseChain dispenseChain;


    @Override
    public void setNextChain(DispenseChain chain) {
        this.dispenseChain = chain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 50) {
            int num = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;
            logger.info("Dispensing {} 50$ note", num);
            if (remainder != 0) this.dispenseChain.dispense(new Currency(remainder));
        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}

class Dollar20Dispense implements DispenseChain {

    private static final Logger logger = LoggerFactory.getLogger(Dollar20Dispense.class);

    private DispenseChain dispenseChain;


    @Override
    public void setNextChain(DispenseChain chain) {
        this.dispenseChain = chain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 20) {
            int num = currency.getAmount() / 20;
            int remainder = currency.getAmount() % 20;
            logger.info("Dispensing {} 20$ note", num);
            if (remainder != 0) this.dispenseChain.dispense(new Currency(remainder));
        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}


class Dollar10Dispense implements DispenseChain {

    private static final Logger logger = LoggerFactory.getLogger(Dollar10Dispense.class);

    private DispenseChain dispenseChain;


    @Override
    public void setNextChain(DispenseChain chain) {
        this.dispenseChain = chain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 10) {
            int num = currency.getAmount() / 10;
            int remainder = currency.getAmount() % 10;
            logger.info("Dispensing {} 10$ note", num);
            if (remainder != 0) this.dispenseChain.dispense(new Currency(remainder));
        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}

