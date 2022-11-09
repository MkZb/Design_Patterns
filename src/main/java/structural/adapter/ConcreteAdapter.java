package structural.adapter;

public class ConcreteAdapter implements Adapter{
    private static final Service service = new ConcreteService();

    @Override
    public void compatibleMethod(String data) {
        System.out.println("ConcreteAdapter#CompatibleMethod");
        service.incompatibleMethod(data);
    }
}
