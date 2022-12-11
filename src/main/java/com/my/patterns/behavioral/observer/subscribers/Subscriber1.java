package com.my.patterns.behavioral.observer.subscribers;

import com.my.patterns.behavioral.observer.Subscriber;

public class Subscriber1 implements Subscriber {
    @Override
    public void update(String context) {
        System.out.println("Subscriber1#update " + context);
    }
}
