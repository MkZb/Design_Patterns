package com.my.patterns.behavioral.observer.subscribers;

import com.my.patterns.behavioral.observer.Subscriber;

public class Subscriber3 implements Subscriber {
    @Override
    public void update(String context) {
        System.out.println("Subscriber3#update " + context);
    }
}
