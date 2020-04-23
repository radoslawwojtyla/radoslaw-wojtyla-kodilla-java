package com.kodilla.good.patterns.challenges.order_service;

public class Product {
    String productName;
    int quantityAtStock;
    boolean availability;
    double price;

    public Product(String productName, int quantity, boolean availability, double price) {
        this.productName = productName;
        this.quantityAtStock = quantity;
        this.availability = availability;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantityAtStock() {
        return quantityAtStock;
    }

    public boolean isAvailability() {
        return availability;
    }

    public double getPrice() {
        return price;
    }
}
