package com.learnDesignPattern.iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationBar {

    private static final Logger logger = LoggerFactory.getLogger(NotificationBar.class);


    private NotificationCollation notificationCollation;

    public NotificationBar(NotificationCollation notificationCollation) {
        this.notificationCollation = notificationCollation;
    }

    public void printNotifications() {
        Iterator iterator = notificationCollation.createIterator();
        logger.info("===Notification Bar===");
        while (iterator.hasNext()) {
            Notification n = (Notification) iterator.next();
            logger.info(n.getNotification());
        }
    }
}
