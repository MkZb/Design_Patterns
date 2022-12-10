package com.my.patterns.structural.facade;

import com.my.patterns.structural.facade.complex_library.Component1;
import com.my.patterns.structural.facade.complex_library.Component2;
import com.my.patterns.structural.facade.complex_library.Component3;

public class Facade {
    private final Component1 component1 = new Component1();
    private final Component2 component2 = new Component2();
    private final Component3 component3 = new Component3();

    public void doStuff1() {
        System.out.println("Facade#doStuff1");
        component1.execute1();
        component1.execute2();
        component2.execute3();
    }

    public void doStuff2() {
        System.out.println("Facade#doStuff2");
        component3.execute1();
        component2.execute3();
        component1.execute1();
    }

}
