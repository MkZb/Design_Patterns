package com.my.patterns.creational.factory_method.product_impl;

import com.my.patterns.creational.factory_method.Product;

public class ProductA implements Product {
    @Override
    public void doStuff() {
        System.out.println("ProductA#doStuff");
    }
}
