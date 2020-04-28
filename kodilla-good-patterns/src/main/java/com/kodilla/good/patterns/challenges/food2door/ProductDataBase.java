package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class ProductDataBase {
    List<Product> productList = new ArrayList<>();

    public List<Product> addProduct() {
        productList.add(new Product("Mleko pełnotłuste", "Nabiał"));
        productList.add(new Product("Ser wędzony", "Nabiał"));
        productList.add(new Product("Pietruszka", "Warzywa"));
        productList.add(new Product("Konfitura z malin", "Przetwory"));
        productList.add(new Product("Jabłka", "Owoce"));
        productList.add(new Product("Kabanosy drobiowe", "Wędliny"));
        return productList;
    }
}
