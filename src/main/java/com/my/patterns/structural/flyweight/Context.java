package com.my.patterns.structural.flyweight;

public class Context {
    private String uniqueState;
    private Flyweight flyweight;

    public Context(String uniqueState, int[] repeatingState) {
        this.uniqueState = uniqueState;
        this.flyweight = FlyweightFactory.getFlyweight(repeatingState);
    }

    public void doStuff() {
        System.out.println("Context#doStuff");
        flyweight.execute(uniqueState);
    }
}
