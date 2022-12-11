package com.my.patterns.behavioral.visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ElementA element) {
        System.out.println("ConcreteVisitor#visit + ElementA");
        element.methodA();
    }

    @Override
    public void visit(ElementB element) {
        System.out.println("ConcreteVisitor#visit + ElementB");
        element.methodB();
    }
}
