package com.kodilla.good.patterns.challenges.food2door;

import java.util.Set;

public class HealthyShop implements OrderService {
    Set<ShopOffer> shopOfferList;
    boolean supplierFound = false;
    boolean productFound = false;
    boolean availability = false;

    @Override
    public void process(Customer customer, OrderRequest orderRequest) {
        System.out.println("Witamy w HEALTHY SHOP. Dziekujemy za skorzystanie z oferty naszego sklepu. Zapewniamy najswiezsza produkty w przystepnych cenach");
        if (shopOfferList.contains(orderRequest.getShopOffer().getSupplier())) {
            supplierFound = true;
        }
        if (shopOfferList.contains(orderRequest.getShopOffer().getProduct())) {
            productFound = true;
        }
        if (orderRequest.getShopOffer().getAvailableQuantity() >= orderRequest.quantity) {
            availability = true;
        }
        if (supplierFound && productFound && availability) {
            System.out.println("Dziekujemy za zlozenie zamowienia: " + orderRequest.getShopOffer().getProduct());
            System.out.println("Prosimy o dokonanie platnosci w kwocie: " + orderRequest.getQuantity() * orderRequest.getShopOffer().getPrice());
        } else {
            System.out.println("Niestety nie mozemy zrealizowac zamowienia. Prosimy o jego ponowne zlozenie, uwzględniając dostepnosc produktu");
        }
    }
}

