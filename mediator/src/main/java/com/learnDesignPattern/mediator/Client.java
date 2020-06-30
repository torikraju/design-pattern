package com.learnDesignPattern.mediator;

public class Client {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User yen = new UserImpl(mediator, "Yen");
        User triss = new UserImpl(mediator, "Triss");
        User ciri = new UserImpl(mediator, "Cirila");
        User finzila = new UserImpl(mediator, "Finzila");

        mediator.addUser(yen, triss, ciri, finzila);

        yen.send("hi all");


    }
}
