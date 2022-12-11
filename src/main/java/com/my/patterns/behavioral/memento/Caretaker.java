package com.my.patterns.behavioral.memento;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class Caretaker {
    private final Originator originator;
    private final Deque<Originator.Memento> history;

    public Caretaker(Originator originator) {
        this.originator = originator;
        history = new LinkedList<>();
    }

    public void doStuff() {
        history.add(originator.save());
        originator.add();
        System.out.println(originator.getState());
    }

    public void undo() {
        originator.restore(Objects.requireNonNull(history.pollLast()));
        System.out.println(originator.getState());
    }
}
