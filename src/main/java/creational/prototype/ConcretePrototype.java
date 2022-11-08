package creational.prototype;

public class ConcretePrototype implements Cloneable {
    private String fieldA;
    private String fieldB;

    ConcretePrototype() {
        fieldA = "initialA";
        fieldB = "initialB";
    }

    ConcretePrototype(ConcretePrototype toCopy) {
        fieldA = toCopy.fieldA;
        fieldB = toCopy.fieldB;
    }

    public String getFieldA() {
        return fieldA;
    }

    public String getFieldB() {
        return fieldB;
    }

    public void setFieldA(String fieldA) {
        this.fieldA = fieldA;
    }

    public void setFieldB(String fieldB) {
        this.fieldB = fieldB;
    }

    @Override
    protected ConcretePrototype clone() throws CloneNotSupportedException {
        return new ConcretePrototype(this);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "fieldA='" + fieldA + '\'' +
                ", fieldB='" + fieldB + '\'' +
                '}';
    }
}
