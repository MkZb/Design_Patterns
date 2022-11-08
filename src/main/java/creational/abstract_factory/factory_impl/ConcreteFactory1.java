package creational.abstract_factory.factory_impl;

import creational.abstract_factory.AbstractFactory;
import creational.abstract_factory.ProductA;
import creational.abstract_factory.ProductB;
import creational.abstract_factory.product_impl.ConcreteProductA1;
import creational.abstract_factory.product_impl.ConcreteProductB1;

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
