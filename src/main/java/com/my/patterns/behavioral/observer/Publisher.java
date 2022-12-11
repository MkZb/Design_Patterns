package com.my.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private String state;
    private final List<Subscriber> subscribers;

    public Publisher() {
        state = "init";
        subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(state);
        }
    }

    public void setState(String state) {
        this.state = state;
        notifySubscribers();
    }
}
