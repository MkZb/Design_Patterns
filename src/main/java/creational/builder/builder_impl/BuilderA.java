package creational.builder.builder_impl;

import creational.builder.Builder;
import creational.builder.products.ProductA;

public class BuilderA implements Builder {
    private ProductA product = new ProductA();

    @Override
    public void reset() {
        product = new ProductA();
    }

    @Override
    public void stepA(String str) {
        product.setFieldA(str);
        System.out.println("BuilderA#stepA :" + product);
    }

    @Override
    public void stepB(String str) {
        product.setFieldB(str);
        System.out.println("BuilderA#stepB :" + product);
    }

    @Override
    public void stepC(String str) {
        product.setFieldC(str);
        System.out.println("BuilderA#stepC :" + product);
    }

    public ProductA getProduct() {
        ProductA currentProduct = product;
        reset();
        return currentProduct;
    }
}
