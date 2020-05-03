package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class SupplierDataBase {
    final List<Supplier> supplierList = new ArrayList<>();

    public List<Supplier> addSupplier() {
        supplierList.add(new Supplier("ExtraFoodShop", "Poznan"));
        supplierList.add(new Supplier("GlutenFreeShop", "Puszczykowo"));
        supplierList.add(new Supplier("HealthyShop", "Wolsztyn"));
        return supplierList;
    }
}
