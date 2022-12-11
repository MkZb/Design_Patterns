package com.my.patterns.behavioral.strategy;

import com.my.patterns.behavioral.strategy.strategies.Strategy1;
import com.my.patterns.behavioral.strategy.strategies.Strategy2;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new Strategy1());
        context.doStuff();
        context.setStrategy(new Strategy2());
        context.doStuff();
    }
}
