package com.my.patterns.structural.decorator;

public class ConcreteComponent implements Component {
    @Override
    public void execute() {
        System.out.println("ConcreteComponent#execute");
    }
}
