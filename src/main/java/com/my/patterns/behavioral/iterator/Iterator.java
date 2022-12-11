package com.my.patterns.behavioral.iterator;

public interface Iterator<T> {
    T getNext();
    boolean hasNext();
}
