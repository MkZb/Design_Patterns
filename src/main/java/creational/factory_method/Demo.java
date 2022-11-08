package creational.factory_method;

import creational.factory_method.creator_impl.CreatorA;
import creational.factory_method.creator_impl.CreatorB;

public class Demo {
    public static void main(String[] args) {
        Creator creator = new CreatorA();
        creator.creatorUse();
        creator = new CreatorB();
        creator.creatorUse();
    }
}
