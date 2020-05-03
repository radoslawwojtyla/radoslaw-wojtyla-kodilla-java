package com.kodilla.good.patterns.challenges.food2door;

public class Product {
    String productName;
    String type;

    public Product(String productName, String type) {
        this.productName = productName;
        this.type = type;
    }

    public String getProductName() {
        return productName;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return  productName;
    }
}
