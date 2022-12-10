package com.my.patterns.creational.builder.builder_impl;

import com.my.patterns.creational.builder.Builder;
import com.my.patterns.creational.builder.products.ProductB;

public class BuilderB implements Builder {
    private ProductB product = new ProductB();

    @Override
    public void reset() {
        product = new ProductB();
    }

    @Override
    public void stepA(String str) {
        product.setFieldA(str);
        System.out.println("BuilderB#stepA :" + product);
    }

    @Override
    public void stepB(String str) {
        product.setFieldB(str);
        System.out.println("BuilderB#stepB :" + product);
    }

    public void extraStep(String str) {
        product.setFieldD(str);
        System.out.println("BuilderB#extraStep :" + product);
    }

    @Override
    public void stepC(String str) {
        product.setFieldC(str);
        System.out.println("BuilderB#stepC :" + product);
    }

    public ProductB getProduct() {
        ProductB currentProduct = product;
        reset();
        return currentProduct;
    }
}
