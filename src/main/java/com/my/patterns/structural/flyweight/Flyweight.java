package com.my.patterns.structural.flyweight;

import java.util.Arrays;

public class Flyweight {
    private final int[] largeArr;

    public Flyweight(int[] largeArr) {
        this.largeArr = largeArr;
    }

    public int[] getLargeArr() {
        return largeArr;
    }

    public void execute(String uniqueState) {
        System.out.println("Flyweight#execute");
        System.out.println("Unique state: " + uniqueState);
        System.out.println("Flyweight: " + Arrays.toString(largeArr) + " obj:" + largeArr);
    }
}
