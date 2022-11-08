package creational.singleton;

public class Singleton {
    private static Singleton instanceOne = null;
    private static final Singleton instanceTwo = new Singleton();

    private Singleton() {
    }

    public static synchronized Singleton getInstanceLazy() {
        if (instanceOne == null) {
            instanceOne = new Singleton();
        }
        return instanceOne;
    }

    public static Singleton getInstanceEager() {
        return instanceTwo;
    }
}
