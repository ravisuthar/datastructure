package com.test;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCartWithoutTax implements ShoppingCartInterface{

    Map<Product, Integer> map = new HashMap<>();

    public void addToCart(Product product, int quantity) {
        if (map.containsKey(product)) {
            Integer existingQuantity = map.get(product);
            map.remove(product);
            map.put(product, existingQuantity + quantity);
        } else {
            map.put(product, quantity);
        }
    }


    public double getTotalPrice() {
       /* double sum = 0.0;
        for (Map.Entry<Product, Integer> entry : map.entrySet()) {
            int quantity = entry.getValue();
            Product product = entry.getKey();
            sum = sum+ (product.getPrice() * quantity);
        }*/

       return map.entrySet().stream()
               .map(entry -> entry.getKey().getPrice() * entry.getValue())
               .reduce(0.0, (a, b) -> a + b);

       // return sum;
    }
}
