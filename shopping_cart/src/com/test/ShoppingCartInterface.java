package com.test;

public interface ShoppingCartInterface {
    void addToCart(Product product, int quantity);
    double getTotalPrice();
}
