package com.my.patterns.structural.decorator.decorators;

import com.my.patterns.structural.decorator.Component;

public class ConcreteDecorator2 extends BaseDecorator {
    public ConcreteDecorator2(Component wrappee) {
        super(wrappee);
    }

    @Override
    public void execute() {
        super.execute();
        System.out.println("ConcreteDecorator2#execute");
    }
}
