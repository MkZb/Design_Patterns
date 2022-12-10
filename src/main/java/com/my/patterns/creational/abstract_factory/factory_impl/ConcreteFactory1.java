package com.my.patterns.creational.abstract_factory.factory_impl;

import com.my.patterns.creational.abstract_factory.AbstractFactory;
import com.my.patterns.creational.abstract_factory.ProductA;
import com.my.patterns.creational.abstract_factory.ProductB;
import com.my.patterns.creational.abstract_factory.product_impl.ConcreteProductB1;
import com.my.patterns.creational.abstract_factory.product_impl.ConcreteProductA1;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
