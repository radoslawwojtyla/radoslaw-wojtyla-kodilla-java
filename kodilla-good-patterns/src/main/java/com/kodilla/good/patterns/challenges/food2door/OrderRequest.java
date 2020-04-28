package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {
    Customer customer;
    ProductDataBase productDataBase;
    int quantity;

    public OrderRequest(Customer customer, ProductDataBase productDataBase, int quantity) {
        this.customer = customer;
        this.productDataBase = productDataBase;
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ProductDataBase getProductDataBase() {
        return productDataBase;
    }

    public int getQuantity() {
        return quantity;
    }
}
