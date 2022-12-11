package com.my.patterns.behavioral.visitor;

public class ElementA implements Element {

    public void methodA() {
        System.out.println("ElementA#methodA");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
