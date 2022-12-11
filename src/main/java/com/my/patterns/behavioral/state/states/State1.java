package com.my.patterns.behavioral.state.states;

import com.my.patterns.behavioral.state.State;

public class State1 implements State {
    @Override
    public void doStuff() {
        System.out.println("State1#doStuff");
    }
}
