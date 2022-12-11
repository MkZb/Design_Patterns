package com.my.patterns.behavioral.template_method;

public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void step1() {
        System.out.println("ConcreteClass1#step1");
    }

    @Override
    protected void step3() {
        System.out.println("ConcreteClass1#step3");
    }
}
