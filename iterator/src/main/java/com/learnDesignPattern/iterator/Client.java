package com.learnDesignPattern.iterator;

public class Client {
    public static void main(String[] args) {
        NotificationCollation nc = new NotificationCollation();
        nc.addItem("Notification 4");
        NotificationBar nb = new NotificationBar(nc);
        nb.printNotifications();
    }
}
