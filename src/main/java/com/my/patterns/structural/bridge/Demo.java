package com.my.patterns.structural.bridge;

import com.my.patterns.structural.bridge.model_impl.ConcreteModel1;
import com.my.patterns.structural.bridge.model_impl.ConcreteModel2;

public class Demo {
    public static void main(String[] args) {
        MainItem mainItem = new MainItem(new ConcreteModel1());
        mainItem.doStuff();
        mainItem = new MainItem(new ConcreteModel2());
        mainItem.doStuff();
    }
}
