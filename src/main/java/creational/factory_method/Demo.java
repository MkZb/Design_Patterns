package creational.factory_method;

import creational.factory_method.creatorImpl.CreatorA;
import creational.factory_method.creatorImpl.CreatorB;

public class Demo {
    public static void main(String[] args) {
        Creator creator = new CreatorA();
        creator.creatorUse();
        creator = new CreatorB();
        creator.creatorUse();
    }
}
