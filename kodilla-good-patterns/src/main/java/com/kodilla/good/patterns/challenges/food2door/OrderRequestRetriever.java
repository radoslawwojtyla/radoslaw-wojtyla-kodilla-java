package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class OrderRequestRetriever {
    List<ShopOffer> shopOfferList;

    public OrderRequest orderRequestRetriever() {
        Customer sampleCustomer = new Customer("Adam", "Poznan, ul. Polna 12");
        ShopOffer sampleOrder = shopOfferList.get(3);
        int sampleQuantity = 4;
        return new OrderRequest(sampleCustomer, sampleOrder, sampleQuantity);
    }

}
