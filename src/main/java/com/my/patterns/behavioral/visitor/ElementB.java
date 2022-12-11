package com.my.patterns.behavioral.visitor;

public class ElementB implements Element {

    public void methodB() {
        System.out.println("ElementB#methodB");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
