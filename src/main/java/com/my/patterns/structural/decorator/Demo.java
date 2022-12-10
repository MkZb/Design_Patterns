package com.my.patterns.structural.decorator;

import com.my.patterns.structural.decorator.decorators.ConcreteDecorator1;
import com.my.patterns.structural.decorator.decorators.ConcreteDecorator2;
import com.my.patterns.structural.decorator.decorators.ConcreteDecorator3;

public class Demo {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator3(component);
        component = new ConcreteDecorator1(component);
        component = new ConcreteDecorator2(component);
        component.execute();
    }
}
