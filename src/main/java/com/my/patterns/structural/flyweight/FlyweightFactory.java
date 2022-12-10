package com.my.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FlyweightFactory {
    private static final List<Flyweight> cache = new ArrayList<>();

    private FlyweightFactory() {
    }

    public static Flyweight getFlyweight(int[] repeatingState) {
        Optional<Flyweight> item = cache.stream().filter(el -> Arrays.equals(el.getLargeArr(), repeatingState)).findFirst();
        if (item.isPresent()) {
            return item.get();
        } else {
            Flyweight newItem = new Flyweight(repeatingState);
            cache.add(newItem);
            return newItem;
        }
    }

}
