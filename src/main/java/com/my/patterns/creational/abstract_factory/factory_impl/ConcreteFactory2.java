package com.my.patterns.creational.abstract_factory.factory_impl;

import com.my.patterns.creational.abstract_factory.product_impl.ConcreteProductB2;
import com.my.patterns.creational.abstract_factory.AbstractFactory;
import com.my.patterns.creational.abstract_factory.ProductA;
import com.my.patterns.creational.abstract_factory.ProductB;
import com.my.patterns.creational.abstract_factory.product_impl.ConcreteProductA2;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
