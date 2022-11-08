package creational.abstract_factory;

import java.lang.reflect.Constructor;

public class Demo {
    public static void main(String[] args) {
        AbstractFactory af = setupFactory("creational.abstract_factory.factory_impl.ConcreteFactory1");
        ProductA productA;
        ProductB productB;
        productA = af.createProductA();
        productB = af.createProductB();
        productA.doStuff();
        productB.doStuff();
        af = setupFactory("creational.abstract_factory.factory_impl.ConcreteFactory2");
        productA = af.createProductA();
        productB = af.createProductB();
        productA.doStuff();
        productB.doStuff();
    }

    public static AbstractFactory setupFactory(String fqn) {
        try {
            Constructor<?> constructor = Class.forName(fqn).getConstructor();
            return (AbstractFactory) constructor.newInstance();
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Something went wrong");
        }
    }
}
