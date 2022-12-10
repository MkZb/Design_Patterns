package com.my.patterns.creational.builder.products;

public class ProductB {
    private String fieldA;
    private String fieldB;
    private String fieldC;
    private String fieldD;

    public void setFieldA(String fieldA) {
        this.fieldA = fieldA;
    }

    public void setFieldB(String fieldB) {
        this.fieldB = fieldB;
    }

    public void setFieldC(String fieldC) {
        this.fieldC = fieldC;
    }

    public void setFieldD(String fieldD) {
        this.fieldD = fieldD;
    }

    @Override
    public String toString() {
        return "ProductB{" +
                "fieldA='" + fieldA + '\'' +
                ", fieldB='" + fieldB + '\'' +
                ", fieldC='" + fieldC + '\'' +
                ", fieldD='" + fieldD + '\'' +
                '}';
    }
}
