package com.test;

import java.util.Map;

public class ShoppingCartWithTax extends ShoppingCartWithoutTax {

    private Buy2Get1FreeOffer offer = new Buy2Get1FreeOffer();
    private static final double TAX_RATE = 12.5;

    public double getTotalPrice() {
        double sum = 0.0;
        for (Map.Entry<Product, Integer> entry : map.entrySet()) {
            int quantity = entry.getValue();
            Product product = entry.getKey();
            sum = sum+ offer.applyOffer(product, quantity);
        }
        return sum + (sum * 12.5 / 100);
    }



}
