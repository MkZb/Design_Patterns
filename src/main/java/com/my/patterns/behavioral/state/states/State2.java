package com.my.patterns.behavioral.state.states;

import com.my.patterns.behavioral.state.State;

public class State2 implements State {
    @Override
    public void doStuff() {
        System.out.println("State2#doStuff");
    }
}
