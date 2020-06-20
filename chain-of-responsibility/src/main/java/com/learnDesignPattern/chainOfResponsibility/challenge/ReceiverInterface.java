package com.learnDesignPattern.chainOfResponsibility.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface ReceiverInterface {
    boolean processMessage(Message msg);

    void setNextChain(ReceiverInterface nextChain);
}

class FaxErrorHandler implements ReceiverInterface {

    private static final Logger logger = LoggerFactory.getLogger(FaxErrorHandler.class);

    private ReceiverInterface nextReceiver;

    @Override
    public boolean processMessage(Message msg) {
        if (msg.getText().contains("Fax")) {
            logger.info("FaxErrorHandler processed {} priority issue: {} ", msg.getPriority(), msg.getText());
            return true;
        } else {
            if (nextReceiver != null) {
                nextReceiver.processMessage(msg);
            }
        }
        return false;
    }

    @Override
    public void setNextChain(ReceiverInterface nextChain) {
        this.nextReceiver = nextChain;
    }
}

class EmailErrorHandler implements ReceiverInterface {

    private static final Logger logger = LoggerFactory.getLogger(EmailErrorHandler.class);

    private ReceiverInterface nextReceiver;

    @Override
    public boolean processMessage(Message msg) {
        if (msg.getText().contains("Email")) {
            logger.info("EmailErrorHandler processed {} priority issue: {} ", msg.getPriority(), msg.getText());
            return true;
        } else {
            if (nextReceiver != null) {
                nextReceiver.processMessage(msg);
            }
        }
        return false;
    }

    @Override
    public void setNextChain(ReceiverInterface nextChain) {
        this.nextReceiver = nextChain;
    }
}
