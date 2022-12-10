package com.my.patterns.behavioral.chain_of_responsibility.handlers;

public interface Handler {
    void setNext(Handler h);
    void handle(String request);
}
