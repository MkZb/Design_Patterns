package com.my.patterns.structural.decorator.decorators;

import com.my.patterns.structural.decorator.Component;

public class BaseDecorator implements Component {
    private final Component wrappee;

    public BaseDecorator(Component wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void execute() {
        wrappee.execute();
    }
}
