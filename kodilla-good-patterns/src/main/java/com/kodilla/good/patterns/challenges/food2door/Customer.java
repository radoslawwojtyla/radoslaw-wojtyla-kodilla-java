package com.kodilla.good.patterns.challenges.food2door;

public class Customer {
    String userName;
    String deliveryAddress;

    public Customer(String userName, String deliveryAddress) {
        this.userName = userName;
        this.deliveryAddress = deliveryAddress;
    }

    public String getUserName() {
        return userName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
}
