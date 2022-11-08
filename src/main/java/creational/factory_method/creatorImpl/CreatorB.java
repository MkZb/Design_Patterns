package creational.factory_method.creatorImpl;

import creational.factory_method.Creator;
import creational.factory_method.Product;
import creational.factory_method.productImpl.ProductB;

public class CreatorB implements Creator {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
