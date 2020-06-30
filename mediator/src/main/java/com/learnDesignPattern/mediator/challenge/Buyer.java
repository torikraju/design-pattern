package com.learnDesignPattern.mediator.challenge;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
public abstract class Buyer {
    private Mediator mediator;
    private String name;
    private int price;

    public Buyer(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void bid(int price);

    public abstract void cancelBid();

    public abstract void actionHasEnded();


}

class AuctionBuyer extends Buyer {

    private static final Logger logger = LoggerFactory.getLogger(AuctionBuyer.class);

    public AuctionBuyer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void bid(int price) {
        this.setPrice(price);
    }

    @Override
    public void cancelBid() {
        this.setPrice(-1);
    }

    @Override
    public void actionHasEnded() {
        logger.info("Received massage that the auction is over: {}", this.getName());
    }
}
