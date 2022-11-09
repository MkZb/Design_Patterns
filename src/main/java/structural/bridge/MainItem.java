package structural.bridge;

public class MainItem {
    //Concrete model implementation may vary and easy to interchange and implement
    private final AbstractModel model;

    MainItem(AbstractModel model){
        this.model = model;
    }

    public void doStuff(){
        System.out.println("MainItem#doStuff");
        model.methodA();
        model.methodB();
    }
}
