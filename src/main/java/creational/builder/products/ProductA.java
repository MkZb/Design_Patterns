package creational.builder.products;

public class ProductA {
    private String fieldA;
    private String fieldB;
    private String fieldC;

    public void setFieldA(String fieldA) {
        this.fieldA = fieldA;
    }

    public void setFieldB(String fieldB) {
        this.fieldB = fieldB;
    }

    public void setFieldC(String fieldC) {
        this.fieldC = fieldC;
    }

    @Override
    public String toString() {
        return "ProductA{" +
                "fieldA='" + fieldA + '\'' +
                ", fieldB='" + fieldB + '\'' +
                ", fieldC='" + fieldC + '\'' +
                '}';
    }
}
