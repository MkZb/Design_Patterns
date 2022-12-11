package com.my.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCollection<T> implements IterableCollection<T> {
    private final List<T> arr;

    public ConcreteCollection() {
        arr = new ArrayList<>();
    }

    public void add(T val) {
        arr.add(val);
    }

    public int size() {
        return arr.size();
    }

    public T get(int idx) {
        return arr.get(idx);
    }

    @Override
    public Iterator<T> getIterator() {
        return new ReverseIterator<>(this);
    }
}
