package creational.factory_method.productImpl;

import creational.factory_method.Product;

public class ProductA implements Product {
    @Override
    public void doStuff() {
        System.out.println("ProductA#doStuff");
    }
}
