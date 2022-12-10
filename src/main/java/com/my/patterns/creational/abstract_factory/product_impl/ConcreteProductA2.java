package com.my.patterns.creational.abstract_factory.product_impl;

import com.my.patterns.creational.abstract_factory.ProductA;

public class ConcreteProductA2 implements ProductA {
    @Override
    public void doStuff() {
        System.out.println("ConcreteProductA2#doStuff");
    }
}
