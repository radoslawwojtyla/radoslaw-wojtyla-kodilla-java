package com.kodilla.good.patterns.challenges.order_service;

import java.time.LocalDate;

public class Delivery {
    String postingCity;
    String pickupCity;
    LocalDate deliveryDate;

    public Delivery(String postingCity, String deliveryCity, LocalDate delivryDate) {
        this.postingCity = postingCity;
        this.pickupCity = deliveryCity;
        this.deliveryDate = delivryDate;
    }

    public String getPostingCity() {
        return postingCity;
    }

    public String getDeliveryCity() {
        return pickupCity;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
}
