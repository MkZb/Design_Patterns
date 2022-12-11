package com.my.patterns.behavioral.observer.subscribers;

import com.my.patterns.behavioral.observer.Subscriber;

public class Subscriber2 implements Subscriber {
    @Override
    public void update(String context) {
        System.out.println("Subscriber2#update " + context);
    }
}
