package com.learnDesignPattern.mediator.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public interface Mediator {
    void addBuyer(Buyer buyer);

    void findHighestBidder();
}

class ActionMediator implements Mediator {

    private static final Logger logger = LoggerFactory.getLogger(ActionMediator.class);

    protected List<Buyer> buyers;

    public ActionMediator() {
        this.buyers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        logger.info("{} was added to buyers list", buyer.getName());
    }

    @Override
    public void findHighestBidder() {
        int maxBid = 0;
        Buyer winner = null;
        for (Buyer b : buyers) {
            if (b.getPrice() > maxBid) {
                maxBid = b.getPrice();
                winner = b;
            }
            b.actionHasEnded();
        }
        logger.info("The auction winner is {}. He paid ${} for the item", winner.getName(), winner.getPrice());
    }
}
