package com.my.patterns.behavioral.memento;

public class Originator {
    private int state;

    public void add() {
        state++;
    }

    public int getState() {
        return state;
    }

    public Memento save() {
        return new Memento(state);
    }

    public void restore(Memento m) {
        state = m.getState();
    }

    public static class Memento {
        private final int state;

        public Memento(int state) {
            this.state = state;
        }

        private int getState() {
            return state;
        }
    }
}
