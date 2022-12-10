package com.my.patterns.structural.proxy;

public class Proxy implements ServiceInterface {
    private final Service service;

    public Proxy(Service service) {
        this.service = service;
    }

    @Override
    public void operation() {
        System.out.println("Proxy#operation before");
        service.operation();
        System.out.println("Proxy#operation after");
    }
}
