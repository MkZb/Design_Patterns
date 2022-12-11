package com.my.patterns.behavioral.template_method;

public class Demo {
    public static void main(String[] args) {
        ConcreteClass1 class1 = new ConcreteClass1();
        ConcreteClass2 class2 = new ConcreteClass2();

        class1.templateMethod();
        System.out.println();
        class2.templateMethod();
    }
}
