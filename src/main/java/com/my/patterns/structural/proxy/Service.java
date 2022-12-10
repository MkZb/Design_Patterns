package com.my.patterns.structural.proxy;

public class Service implements ServiceInterface {
    @Override
    public void operation() {
        System.out.println("Service#operation");
    }
}
