package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String[] args) throws Exception {
        ShopOfferDataBase shopOfferDataBase = new ShopOfferDataBase();
        shopOfferDataBase.addShopOffer();

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.orderRequestRetriever();

        Warehouse warehouse = new Warehouse();
        warehouse.process(orderRequest);
    }
}
