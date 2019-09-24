package com.kqyang.chapter03.builder.example;

public class ConcreteDecorator2 extends Decorator {
    @Override
    public void buildWall() {
        parlour.setWall("w2");
    }

    @Override
    public void buildTV() {
        parlour.setTV("TV2");
    }

    @Override
    public void buildSofa() {
        parlour.setSofa("sf2");
    }
}
