package com.learnDesignPattern.mediator;

public interface ChatMediator {
    void sendMessage(String message, User user);

    void addUser(User... users);
}
