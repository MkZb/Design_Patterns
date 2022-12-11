package com.my.patterns.behavioral.strategy;

public class Context {
    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doStuff() {
        strategy.execute();
    }
}
