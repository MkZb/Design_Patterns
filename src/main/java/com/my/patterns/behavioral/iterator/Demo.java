package com.my.patterns.behavioral.iterator;

public class Demo {
    public static void main(String[] args) {
        ConcreteCollection<String> col = new ConcreteCollection<>();
        col.add("1");
        col.add("2");
        col.add("3");
        col.add("4");
        col.add("5");
        col.add("6");
        Iterator<String> iterator = col.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }
    }
}
