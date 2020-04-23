package com.kodilla.good.patterns.challenges.order_service;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class OrderList implements OrderDataBase {
    @Override

    public boolean newOrder(User user, Product product, Delivery delivery, LocalDate orderDate) {
        boolean result;
        if (product.availability) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}