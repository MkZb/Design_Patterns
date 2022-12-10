package com.my.patterns.behavioral.chain_of_responsibility;

import com.my.patterns.behavioral.chain_of_responsibility.handlers.ConcreteHandler1;
import com.my.patterns.behavioral.chain_of_responsibility.handlers.ConcreteHandler2;
import com.my.patterns.behavioral.chain_of_responsibility.handlers.Handler;

public class Demo {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        h1.setNext(h2);
        h1.handle("asdjlasjdaksjdlasdjasldj");
    }
}
