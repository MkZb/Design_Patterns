package com.my.patterns.behavioral.visitor;

public class Demo {
    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor();
        ElementA elementA = new ElementA();
        ElementB elementB = new ElementB();

        elementA.accept(visitor);
        elementB.accept(visitor);
    }
}
