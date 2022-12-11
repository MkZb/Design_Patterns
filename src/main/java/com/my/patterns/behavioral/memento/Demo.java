package com.my.patterns.behavioral.memento;

public class Demo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker(originator);
        caretaker.doStuff();
        caretaker.doStuff();
        caretaker.doStuff();
        caretaker.undo();
        caretaker.undo();
        caretaker.undo();
    }
}
