package com.kqyang.chapter03.builder;

public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("建造A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造C");
    }
}
