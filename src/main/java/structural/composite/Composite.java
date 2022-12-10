package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private final List<Component> childrenList;

    public Composite() {
        childrenList = new ArrayList<>();
    }

    public void add(Component c) {
        childrenList.add(c);
    }

    @Override
    public int execute() {
        int sum = 0;
        for (Component component : childrenList) {
            sum += component.execute();
        }
        return sum;
    }
}
