package creational.singleton;

public class Demo {
    public static void main(String[] args) {
        Singleton one = Singleton.getInstanceEager();
        System.out.println(one);
        one = Singleton.getInstanceEager();
        System.out.println(one);

        Singleton two = Singleton.getInstanceLazy();
        System.out.println(two);
        two = Singleton.getInstanceLazy();
        System.out.println(two);
    }
}
