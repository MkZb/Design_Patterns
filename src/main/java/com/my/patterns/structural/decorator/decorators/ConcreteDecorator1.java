package com.my.patterns.structural.decorator.decorators;

import com.my.patterns.structural.decorator.Component;

public class ConcreteDecorator1 extends BaseDecorator {
    public ConcreteDecorator1(Component wrappee) {
        super(wrappee);
    }

    @Override
    public void execute() {
        super.execute();
        System.out.println("ConcreteDecorator1#execute");
    }
}
