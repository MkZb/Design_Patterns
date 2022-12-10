package structural.composite;

public class Demo {
    public static void main(String[] args) {
        Composite root = new Composite();
        root.add(new Leaf());
        root.add(new Leaf());
        root.add(new Leaf());
        Composite container = new Composite();
        container.add(new Leaf());
        container.add(new Leaf());
        container.add(new Leaf());
        container.add(new Composite());
        root.add(container);

        System.out.println(root.execute());
    }
}
