package com.my.patterns.behavioral.observer;

import com.my.patterns.behavioral.observer.subscribers.Subscriber1;
import com.my.patterns.behavioral.observer.subscribers.Subscriber2;
import com.my.patterns.behavioral.observer.subscribers.Subscriber3;

public class Demo {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Subscriber subscriber1 = new Subscriber1();
        Subscriber subscriber2 = new Subscriber2();
        Subscriber subscriber3 = new Subscriber3();
        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);
        publisher.subscribe(subscriber3);
        publisher.setState("state1");
        publisher.unsubscribe(subscriber2);
        publisher.setState("state3");
    }
}
