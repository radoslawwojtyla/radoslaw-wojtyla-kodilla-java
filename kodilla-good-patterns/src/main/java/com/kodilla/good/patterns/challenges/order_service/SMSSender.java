package com.kodilla.good.patterns.challenges.order_service;

public class SMSSender implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Sending SMS");
    }
}
