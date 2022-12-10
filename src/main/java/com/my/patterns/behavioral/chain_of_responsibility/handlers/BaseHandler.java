package com.my.patterns.behavioral.chain_of_responsibility.handlers;

public class BaseHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler h) {
        next = h;
    }

    @Override
    public void handle(String request) {
        if (next != null) {
            next.handle(request);
        }
    }
}
