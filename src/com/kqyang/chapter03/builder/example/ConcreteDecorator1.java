package com.kqyang.chapter03.builder.example;

public class ConcreteDecorator1 extends Decorator {
    @Override
    public void buildWall() {
        parlour.setWall("w1");
    }

    @Override
    public void buildTV() {
        parlour.setTV("TV1");
    }

    @Override
    public void buildSofa() {
        parlour.setSofa("sf1");
    }
}
