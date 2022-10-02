package com.test;

public class Buy2Get1FreeOffer {

    public double applyOffer(Product product, int quantity) {


        //3,   pay=2  free=1
        //4   pay=3 free=1
        //5   pay=4, free=1
        //6   pay=4, free=2
        if (product.getName().equals("Dove") && quantity >= 2) {
            int freeItem = (quantity / 3);
            int payItem = quantity - freeItem;
            return product.getPrice() * payItem;
        } else {
            return product.getPrice() * quantity;
        }
    }
}
