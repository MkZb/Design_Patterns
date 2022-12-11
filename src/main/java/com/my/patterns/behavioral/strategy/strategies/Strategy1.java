package com.my.patterns.behavioral.strategy.strategies;

import com.my.patterns.behavioral.strategy.Strategy;

public class Strategy1 implements Strategy {
    @Override
    public void execute() {
        System.out.println("Strategy1#execute");
    }
}
