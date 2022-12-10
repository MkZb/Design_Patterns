package com.my.patterns.structural.proxy;

public class Demo {
    public static void main(String[] args) {
        ServiceInterface service = new Proxy(new Service());
        service.operation();
    }
}
