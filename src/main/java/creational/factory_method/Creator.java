package creational.factory_method;

public interface Creator {
    Product createProduct();

    default void creatorUse() {
        Product product = createProduct();
        product.doStuff();
    }
}
