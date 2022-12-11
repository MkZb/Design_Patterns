package com.my.patterns.behavioral.mediator;

public class BaseComponent {
    private final Mediator mediator;

    public BaseComponent(Mediator mediator) {
        this.mediator = mediator;
    }

    void action1() {
        mediator.notify(this, "action1");
    }

    void action2() {
        mediator.notify(this, "action2");
    }
}
