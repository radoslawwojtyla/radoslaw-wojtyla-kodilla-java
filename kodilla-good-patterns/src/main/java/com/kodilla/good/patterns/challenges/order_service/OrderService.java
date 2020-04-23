package com.kodilla.good.patterns.challenges.order_service;

import java.time.LocalDate;

public interface OrderService {

    boolean order(User user, Product product, LocalDate orderDate, Delivery delivery);
}
