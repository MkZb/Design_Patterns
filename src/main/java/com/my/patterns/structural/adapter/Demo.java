package com.my.patterns.structural.adapter;

public class Demo {
    public static void main(String[] args) {
        Adapter adapter = new ConcreteAdapter();
        adapter.compatibleMethod("Send this to service");
    }
}
