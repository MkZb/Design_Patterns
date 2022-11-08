package creational.prototype;

public class SubPrototype extends ConcretePrototype {
    private String fieldC;

    public SubPrototype() {
        fieldC = "initialC";
    }

    public SubPrototype(ConcretePrototype toCopy) {
        super(toCopy);
        if (toCopy instanceof SubPrototype subPrototype) {
            fieldC = subPrototype.fieldC;
        } else {
            fieldC = "initialC";
        }
    }

    @Override
    protected ConcretePrototype clone() throws CloneNotSupportedException {
        return new SubPrototype(this);
    }

    @Override
    public String toString() {
        return "SubPrototype{" +
                "fieldA='" + super.getFieldA() + '\'' +
                ", fieldB='" + super.getFieldB() + '\'' +
                ", fieldC='" + fieldC + '\'' +
                '}';
    }
}
