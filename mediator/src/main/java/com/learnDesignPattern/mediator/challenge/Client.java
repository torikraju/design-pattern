package com.learnDesignPattern.mediator.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        ActionMediator mediator = new ActionMediator();

        Buyer b1 = new AuctionBuyer(mediator, "Yen");
        Buyer b2 = new AuctionBuyer(mediator, "Triss");
        Buyer b3 = new AuctionBuyer(mediator, "Ciri");

        mediator.addBuyer(b1);
        mediator.addBuyer(b2);
        mediator.addBuyer(b3);

        logger.info("Welcome to the auction. Tonight we are selling a vacation");
        logger.info("---------------------------------------------------------");

        b1.bid(1800);
        b2.bid(2500);
        b3.bid(450);

        logger.info("---------------------------------------------------------");
        mediator.findHighestBidder();

        b2.cancelBid();

        logger.info("---------------------------------------------------------");
        mediator.findHighestBidder();

    }
}
