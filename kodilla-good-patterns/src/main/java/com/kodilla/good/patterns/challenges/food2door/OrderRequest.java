package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {
    Customer customer;
    ShopOffer shopOffer;
    int quantity;

    public OrderRequest(Customer customer, ShopOffer shopOffer, int quantity) {
        this.customer = customer;
        this.shopOffer = shopOffer;
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ShopOffer getShopOffer() {
        return shopOffer;
    }

    public int getQuantity() {
        return quantity;
    }
}
