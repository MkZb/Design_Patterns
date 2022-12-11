package com.my.patterns.behavioral.strategy.strategies;

import com.my.patterns.behavioral.strategy.Strategy;

public class Strategy2 implements Strategy {
    @Override
    public void execute() {
        System.out.println("Strategy2#execute");
    }
}
