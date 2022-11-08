package creational.prototype;

public class Demo {
    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype();
        System.out.println(cp);
        cp.setFieldA("newValA");
        cp.setFieldB("newValB");
        SubPrototype sp = new SubPrototype(cp);
        System.out.println(sp);
        sp.setFieldB("anotherNewValB");
        System.out.println(sp);
        cp = new ConcretePrototype(sp);
        System.out.println(cp);
    }
}
