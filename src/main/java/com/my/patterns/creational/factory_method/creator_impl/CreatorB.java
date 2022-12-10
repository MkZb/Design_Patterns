package com.my.patterns.creational.factory_method.creator_impl;

import com.my.patterns.creational.factory_method.Creator;
import com.my.patterns.creational.factory_method.Product;
import com.my.patterns.creational.factory_method.product_impl.ProductB;

public class CreatorB implements Creator {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
