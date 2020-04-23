package com.kodilla.good.patterns.challenges.order_service;

import java.time.LocalDate;

public interface OrderDataBase {
    boolean newOrder(User user, Product product, Delivery delivery, LocalDate orderDate);
}
