package creational.factory_method.creator_impl;

import creational.factory_method.Creator;
import creational.factory_method.Product;
import creational.factory_method.product_impl.ProductB;

public class CreatorB implements Creator {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
