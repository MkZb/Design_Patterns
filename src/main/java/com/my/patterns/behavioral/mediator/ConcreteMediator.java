package com.my.patterns.behavioral.mediator;

public class ConcreteMediator implements Mediator {
    private final Component1 component1;
    private final Component2 component2;

    public ConcreteMediator() {
        component1 = new Component1(this);
        component2 = new Component2(this);
    }

    public Component1 getComponent1() {
        return component1;
    }

    public Component2 getComponent2() {
        return component2;
    }

    @Override
    public void notify(BaseComponent component, String event) {
        if (component == component1) {
            if (event.equals("action1")) {
                System.out.println("ConcreteMediator#notify Component1 action1");
            } else if (event.equals("action2")) {
                System.out.println("ConcreteMediator#notify Component1 action2");
            }
        } else if (component == component2) {
            if (event.equals("action1")) {
                System.out.println("ConcreteMediator#notify Component2 action1");
            } else if (event.equals("action2")) {
                System.out.println("ConcreteMediator#notify Component2 action2");
            }
        }
    }
}
