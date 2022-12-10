package com.my.patterns.creational.builder;

public interface Builder {
    void reset();
    void stepA(String str);
    void stepB(String str);
    void stepC(String str);
}
