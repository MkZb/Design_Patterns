package creational.abstract_factory.factory_impl;

import creational.abstract_factory.AbstractFactory;
import creational.abstract_factory.ProductA;
import creational.abstract_factory.ProductB;
import creational.abstract_factory.product_impl.ConcreteProductA2;
import creational.abstract_factory.product_impl.ConcreteProductB2;

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
