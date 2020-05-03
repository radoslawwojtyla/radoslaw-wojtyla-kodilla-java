package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;
import java.util.Set;

public class HealthyShop implements OrderService {
    ShopOfferDataBase shopOfferDataBase = new ShopOfferDataBase();
    List<ShopOffer> shopOfferList = shopOfferDataBase.addShopOffer();
    boolean supplierFound = false;
    boolean productFound = false;
    boolean availability = false;

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Witamy w HEALTHY SHOP. Dziekujemy za skorzystanie z oferty naszego sklepu. Zapewniamy najswiezsza produkty w przystepnych cenach.");
        for (ShopOffer offer : shopOfferList) {
            if (orderRequest.getShopOffer().getSupplier().getSupplierName().equals(offer.getSupplier().getSupplierName())) {
                supplierFound = true;
            }
            if (orderRequest.getShopOffer().getProduct().getProductName().equals(offer.getProduct().getProductName())) {
                productFound = true;
            }
            if (orderRequest.getQuantity() <= offer.getAvailableQuantity()) {
                availability = true;
            }
        }

        if (supplierFound && productFound && availability) {
            System.out.println("Dziekujemy za zlozenie zamowienia: " + orderRequest.getShopOffer().getProduct());
            System.out.println("Prosimy o dokonanie platnosci w kwocie: " + orderRequest.getQuantity() * orderRequest.getShopOffer().getPrice());
        } else {
            System.out.println("Niestety nie mozemy zrealizowac zamowienia. Prosimy o jego ponowne zlozenie, uwzględniając dostepnosc produktu.");
        }
    }
}

