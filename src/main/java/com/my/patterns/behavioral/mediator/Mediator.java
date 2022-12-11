package com.my.patterns.behavioral.mediator;

public interface Mediator {
    void notify(BaseComponent component, String event);
}
