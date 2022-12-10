package com.my.patterns.structural.flyweight;

public class Demo {
    public static void main(String[] args) {
        int[] largeData = {1, 3, 4, 5, 6, 1, 2, 2, 2, 1, 3, 4, 5, 6, 7, 1, 2, 3, 4, 6, 8};
        Context[] contexts = new Context[10];
        for (int i = 0; i < contexts.length; i++) {
            contexts[i] = new Context(String.valueOf(i), largeData);
        }

        for (Context el : contexts) {
            el.doStuff();
        }
    }
}
