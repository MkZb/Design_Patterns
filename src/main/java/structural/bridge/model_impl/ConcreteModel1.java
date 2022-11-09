package structural.bridge.model_impl;

import structural.bridge.AbstractModel;

public class ConcreteModel1 implements AbstractModel {
    @Override
    public void methodA() {
        System.out.println("ConcreteModel1#methodA");
    }

    @Override
    public void methodB() {
        System.out.println("ConcreteModel1#methodB");
    }
}
