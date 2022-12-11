package com.my.patterns.behavioral.template_method;

public abstract class AbstractClass {
    public void templateMethod() {
        step1();
        step2();
        step3();
    }

    protected abstract void step1();

    protected void step2() {
        System.out.println("Base step2");
    }

    protected abstract void step3();
}
