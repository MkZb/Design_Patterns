package com.my.patterns.behavioral.chain_of_responsibility.handlers;

public class ConcreteHandler2 extends BaseHandler {
    @Override
    public void handle(String request) {
        if (request.contains("a")) {
            System.out.println("ConcreteHandler2#handle handled specific case");
        }
        super.handle(request);
    }
}
