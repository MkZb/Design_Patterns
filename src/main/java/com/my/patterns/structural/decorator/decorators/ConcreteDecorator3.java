package com.my.patterns.structural.decorator.decorators;

import com.my.patterns.structural.decorator.Component;

public class ConcreteDecorator3 extends BaseDecorator {
    public ConcreteDecorator3(Component wrappee) {
        super(wrappee);
    }

    @Override
    public void execute() {
        super.execute();
        System.out.println("ConcreteDecorator3#execute");
    }
}
