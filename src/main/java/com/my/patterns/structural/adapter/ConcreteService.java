package com.my.patterns.structural.adapter;

public class ConcreteService implements Service {
    @Override
    public void incompatibleMethod(String data) {
        System.out.println("ConcreteService#IncompatibleMethod " + data);
    }
}
