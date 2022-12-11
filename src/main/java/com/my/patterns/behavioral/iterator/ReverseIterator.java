package com.my.patterns.behavioral.iterator;

public class ReverseIterator<T> implements Iterator<T> {
    private final ConcreteCollection<T> collection;
    private int idx;

    public ReverseIterator(ConcreteCollection<T> collection) {
        this.collection = collection;
        idx = collection.size() - 1;
    }

    @Override
    public T getNext() {
        return collection.get(idx--);
    }

    @Override
    public boolean hasNext() {
        return idx > -1;
    }
}
