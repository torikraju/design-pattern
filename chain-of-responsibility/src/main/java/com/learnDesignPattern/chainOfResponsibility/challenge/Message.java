package com.learnDesignPattern.chainOfResponsibility.challenge;

import lombok.Data;

enum MessagePriority {
    NORMAL, HIGH
}

@Data
public class Message {
    private String text;
    private MessagePriority priority;


    public Message(String text, MessagePriority priority) {
        this.text = text;
        this.priority = priority;
    }
}
