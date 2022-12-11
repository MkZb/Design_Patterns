package com.my.patterns.behavioral.mediator;

public class Demo {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        concreteMediator.getComponent1().action1();
        concreteMediator.getComponent1().action2();
        concreteMediator.getComponent2().action1();
        concreteMediator.getComponent2().action2();
    }
}
