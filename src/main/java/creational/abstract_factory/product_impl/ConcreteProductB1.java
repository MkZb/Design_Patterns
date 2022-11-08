package creational.abstract_factory.product_impl;

import creational.abstract_factory.ProductB;

public class ConcreteProductB1 implements ProductB {
    @Override
    public void doStuff() {
        System.out.println("ConcreteProductB1#doStuff");
    }
}
