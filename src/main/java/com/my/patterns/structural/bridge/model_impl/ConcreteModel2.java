package com.my.patterns.structural.bridge.model_impl;

import com.my.patterns.structural.bridge.AbstractModel;

public class ConcreteModel2 implements AbstractModel {
    @Override
    public void methodA() {
        System.out.println("ConcreteModel2#methodA");
    }

    @Override
    public void methodB() {
        System.out.println("ConcreteModel2#methodB");
    }
}
