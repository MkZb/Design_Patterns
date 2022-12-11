package com.my.patterns.behavioral.template_method;

public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void step1() {
        System.out.println("ConcreteClass2#step1");
    }

    @Override
    protected void step3() {
        System.out.println("ConcreteClass2#step3");
    }
}
