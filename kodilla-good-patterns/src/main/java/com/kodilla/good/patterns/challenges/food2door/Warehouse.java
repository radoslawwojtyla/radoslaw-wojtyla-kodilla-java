package com.kodilla.good.patterns.challenges.food2door;

public class Warehouse {

    public void process(OrderRequest orderRequest) throws Exception {
        OrderService orderService = ShopFactory.getShop(orderRequest.getShopOffer().getSupplier());
        if (orderService != null) {
            orderService.process(orderRequest);
        } else {
            throw new Exception("Nie wybrano zadnego dostawcy / dostawca nie istnieje");
        }
    }
}
