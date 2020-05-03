package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class ExtraFoodShop implements OrderService {
    Customer customer;
    ShopOfferDataBase shopOfferDataBase = new ShopOfferDataBase();
    List<ShopOffer> shopOfferList = shopOfferDataBase.addShopOffer();

    @Override
    public void process(OrderRequest orderRequest) {
        customer = orderRequest.getCustomer();
        System.out.println("Witaj " + customer + "! Dziekujemy za zaufanie, jakim darzysz nasza firme.");
        boolean result = shopOfferList.stream()
                .filter(order -> order.getSupplier().getSupplierName().equals(orderRequest.getShopOffer().getSupplier().getSupplierName()))
                .filter(order -> order.getProduct().getProductName().equals(orderRequest.getShopOffer().getProduct().getProductName()))
                .filter(order -> order.getAvailableQuantity() >= orderRequest.getQuantity())
                .map(o -> true)
                .findAny()
                .orElse(false);

        if (result) {
            System.out.println("Twoje zamowienie:" + "\n" + orderRequest.getShopOffer().getProduct() + " - "
                    + orderRequest.getQuantity() + "szt. zostalo przekazane do realizacji.");
        } else {
            System.out.println("Niestety, produkt jest niedostępny lub jest niedostepny w deklarowanej przez Ciebie ilosci.");
        }
    }
}