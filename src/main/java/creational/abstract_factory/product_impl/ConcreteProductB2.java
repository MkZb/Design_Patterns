package creational.abstract_factory.product_impl;

import creational.abstract_factory.ProductB;

public class ConcreteProductB2 implements ProductB {
    @Override
    public void doStuff() {
        System.out.println("ConcreteProductB2#doStuff");
    }
}
