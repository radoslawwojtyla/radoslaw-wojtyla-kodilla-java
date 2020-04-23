package com.kodilla.good.patterns.challenges.order_service;

import java.time.LocalDate;

public class OrderRequest {
    User user;
    Product product;
    LocalDate orderDate;
    Delivery delivery;
    int quantity;

    public OrderRequest(User user, Product product, LocalDate localDate, Delivery delivery, int quantity) {
        this.user = user;
        this.product = product;
        this.orderDate = localDate;
        this.delivery = delivery;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getLocalDate() {
        return orderDate;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public int getQuantity() {
        return quantity;
    }
}
