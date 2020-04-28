package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements OrderService {

    @Override
    public void process(Customer customer, ShopOfferDataBase shopOfferDataBase) {
        System.out.println("Witaj " + customer + "! Dziekujemy za zaufanie, jakim darzysz nasza firme.");
        if (shopOfferDataBase) {

        }
    }
}
