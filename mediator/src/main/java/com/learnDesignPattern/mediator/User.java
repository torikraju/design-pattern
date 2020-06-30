package com.learnDesignPattern.mediator;

import lombok.Data;

@Data
public abstract class User {
    protected ChatMediator mediator;
    private String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void receive(String message);

}
