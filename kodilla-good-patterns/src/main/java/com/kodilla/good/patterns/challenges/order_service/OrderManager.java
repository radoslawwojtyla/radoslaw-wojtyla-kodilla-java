package com.kodilla.good.patterns.challenges.order_service;

import java.time.LocalDate;

public class OrderManager implements OrderService {
    @Override
    public boolean order(User user, Product product, LocalDate orderDate, Delivery delivery) { {
            boolean result;
            if (product.availability) {
                System.out.println("We have forwarded your order (" + product.productName + ") to be carried out");
                result = true;
            } else {
                System.out.println("Product is unavailable. We cannot proceed");
                result = false;
            }
            return result;
        }
    }
}
