package com.kodilla.good.patterns.challenges.order_service;

public class MessageSender implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Hello " + user.getUserNick() + "!" + "\n" + "Thank you for an order.");
    }
}
