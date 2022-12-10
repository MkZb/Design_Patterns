package com.my.patterns.behavioral.chain_of_responsibility.handlers;

public class ConcreteHandler1 extends BaseHandler {
    @Override
    public void handle(String request) {
        if (request.length() > 10) {
            System.out.println("ConcreteHandler1#handle handled specific case");
        }
        super.handle(request);
    }
}
