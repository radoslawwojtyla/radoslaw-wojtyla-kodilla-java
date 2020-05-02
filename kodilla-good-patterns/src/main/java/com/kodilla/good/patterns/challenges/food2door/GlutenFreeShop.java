package com.kodilla.good.patterns.challenges.food2door;

import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class GlutenFreeShop implements OrderService {
    Set<ShopOffer> shopOfferList;
    boolean confirmation = false;

    @Override
    public void process(Customer customer, OrderRequest orderRequest) {
        for (ShopOffer offer : shopOfferList) {
            if (orderRequest.getShopOffer().getSupplier().equals(offer.getSupplier())) {
                if (orderRequest.getShopOffer().getProduct().equals(offer.getProduct())) {
                    if (orderRequest.getQuantity() <= offer.getAvailableQuantity()) {
                        confirmation = true;
                    }
                }
            }
        }

        if (confirmation) {
            double price = orderRequest.getQuantity() * orderRequest.getShopOffer().getPrice();
            System.out.println("Wartosc Twojego zamowienia: " + orderRequest.getShopOffer().getProduct() + "/n" + "wynosi: "
                    + price);
            System.out.println("Smacznego!");
        } else {
            System.out.println("Twoje zamowienie: " + orderRequest.getShopOffer().getProduct() + "nie moze byc zrealizowane");
            System.out.println("Zamowiona ilosc produktu: " + orderRequest.getQuantity());
            System.out.println("Dostepna ilosc: " + orderRequest.getShopOffer().getAvailableQuantity());
        }
    }
}
