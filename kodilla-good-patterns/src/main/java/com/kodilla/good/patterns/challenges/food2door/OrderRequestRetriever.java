package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;
import java.util.Set;

public class OrderRequestRetriever {
    ShopOfferDataBase shopOfferDataBase = new ShopOfferDataBase();
    List<ShopOffer> shopOfferList = shopOfferDataBase.addShopOffer();

    public OrderRequest orderRequestRetriever() {
        Customer sampleCustomer = new Customer("Adam", "Poznan, ul. Polna 12");
        ShopOffer sampleOrder = shopOfferList.get(0);
        int sampleQuantity = 4;
        return new OrderRequest(sampleCustomer, sampleOrder, sampleQuantity);
    }
}
