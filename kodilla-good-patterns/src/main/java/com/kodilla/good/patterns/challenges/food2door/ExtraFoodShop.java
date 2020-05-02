package com.kodilla.good.patterns.challenges.food2door;

import java.util.Set;

public class ExtraFoodShop implements OrderService {
    Set<ShopOffer> shopOfferList;

    @Override
    public void process(Customer customer, OrderRequest orderRequest) {
        System.out.println("Witaj " + customer + "! Dziekujemy za zaufanie, jakim darzysz nasza firme.");
        boolean result = shopOfferList.stream()
                .filter(order -> order.getSupplier().equals(orderRequest.getShopOffer().getSupplier()))
                .filter(order -> order.getProduct().equals(orderRequest.getShopOffer().getProduct()))
                .filter(order -> order.getAvailableQuantity() <= orderRequest.getQuantity())
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