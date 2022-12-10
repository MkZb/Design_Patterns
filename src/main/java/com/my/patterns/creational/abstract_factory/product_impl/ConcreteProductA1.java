package com.my.patterns.creational.abstract_factory.product_impl;

import com.my.patterns.creational.abstract_factory.ProductA;

public class ConcreteProductA1 implements ProductA {
    @Override
    public void doStuff() {
        System.out.println("ConcreteProductA1#doStuff");
    }
}
