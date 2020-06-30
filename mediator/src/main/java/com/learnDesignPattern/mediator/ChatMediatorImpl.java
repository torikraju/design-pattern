package com.learnDesignPattern.mediator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        this.users.forEach(el -> {
            if (user != el) el.receive(message);
        });
    }

    @Override
    public void addUser(User... users) {
        this.users.addAll(Arrays.asList(users));
    }
}
