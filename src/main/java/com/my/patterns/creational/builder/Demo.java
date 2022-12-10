package com.my.patterns.creational.builder;

import com.my.patterns.creational.builder.builder_impl.BuilderA;
import com.my.patterns.creational.builder.builder_impl.BuilderB;
import com.my.patterns.creational.builder.products.ProductA;
import com.my.patterns.creational.builder.products.ProductB;

public class Demo {
    public static void main(String[] args) {
        BuilderA builderA = new BuilderA();
        BuilderB builderB = new BuilderB();
        Director.makeFirstScenario(builderA);
        ProductA productA = builderA.getProduct();
        System.out.println(productA);
        System.out.println("-----------------");
        Director.makeSecondScenario(builderB);
        ProductB productB = builderB.getProduct();
        System.out.println(productB);
        System.out.println("-----------------");
        Director.makeFirstScenario(builderB);
        productB = builderB.getProduct();
        System.out.println(productB);
    }
}
