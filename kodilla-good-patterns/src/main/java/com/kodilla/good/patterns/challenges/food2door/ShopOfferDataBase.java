package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public class ShopOfferDataBase {
    List<ShopOffer> shopOfferList = new ArrayList<>();
    ProductDataBase productDataBase = new ProductDataBase();
    List<Product> productList = productDataBase.addProduct();
    SupplierDataBase supplierDataBase = new SupplierDataBase();
    List<Supplier> supplierList = supplierDataBase.addSupplier();

    public List<ShopOffer> addShopOffer() {
        shopOfferList.add(new ShopOffer(supplierList.get(0), productList.get(0), 100, 3.99 ));
        shopOfferList.add(new ShopOffer(supplierList.get(0), productList.get(2), 40,3.00));
        shopOfferList.add(new ShopOffer(supplierList.get(0), productList.get(3), 10,6.99));
        shopOfferList.add(new ShopOffer(supplierList.get(0), productList.get(5), 14,25.19));
        shopOfferList.add(new ShopOffer(supplierList.get(1), productList.get(0), 10,4.49));
        shopOfferList.add(new ShopOffer(supplierList.get(1), productList.get(2), 50,3.29));
        shopOfferList.add(new ShopOffer(supplierList.get(1), productList.get(4), 500,3.49));
        shopOfferList.add(new ShopOffer(supplierList.get(2), productList.get(1), 5,32.49));
        shopOfferList.add(new ShopOffer(supplierList.get(2), productList.get(2), 7,2.80));
        shopOfferList.add(new ShopOffer(supplierList.get(2), productList.get(5), 22,18.88));
        return shopOfferList;
    }
}
