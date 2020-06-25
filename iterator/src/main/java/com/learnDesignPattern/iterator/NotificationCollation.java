package com.learnDesignPattern.iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationCollation implements Collection {

    private static final Logger logger = LoggerFactory.getLogger(NotificationCollation.class);

    static final int MAX_ITEM = 6;
    private int numberOfItem = 0;
    private Notification[] notifications;

    public NotificationCollation() {
        notifications = new Notification[MAX_ITEM];
        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    public void addItem(String s) {
        Notification notification = new Notification(s);
        if (numberOfItem >= MAX_ITEM) {
            logger.error("Full");
        } else {
            notifications[numberOfItem] = notification;
            numberOfItem += 1;
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notifications);
    }
}
