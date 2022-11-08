package creational.factory_method.productImpl;

import creational.factory_method.Product;

public class ProductB implements Product {
    @Override
    public void doStuff() {
        System.out.println("ProductB#doStuff");
    }
}
