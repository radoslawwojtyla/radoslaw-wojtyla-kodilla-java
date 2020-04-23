package com.kodilla.good.patterns.challenges.order_service;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest orderRequestRetriever() {
        User user = new User ("Orzel", "Adam", "Malysz");
        Product product = new Product("Kapcie", 10, true, 10.50);
        Delivery delivery = new Delivery("Pyongyang", "Wuhan", LocalDate.now().plusDays(14));
        LocalDate orderDate = LocalDate.now();
        int orderQuantity = 1;

        return new OrderRequest(user, product, orderDate, delivery, orderQuantity);
    }
}
