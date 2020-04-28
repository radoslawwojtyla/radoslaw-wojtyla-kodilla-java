package com.kodilla.good.patterns.challenges.food2door;

public class Supplier {
    String supplierName;
    String city;

    public Supplier(String supplierName, String city) {
        this.supplierName = supplierName;
        this.city = city;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getCity() {
        return city;
    }
}
