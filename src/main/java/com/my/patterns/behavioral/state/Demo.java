package com.my.patterns.behavioral.state;

import com.my.patterns.behavioral.state.states.State1;
import com.my.patterns.behavioral.state.states.State2;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context(new State1());
        context.doStuff();
        context.setState(new State2());
        context.doStuff();
    }
}
