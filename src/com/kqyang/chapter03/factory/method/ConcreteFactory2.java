package com.kqyang.chapter03.factory.method;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂2...生产具体产品2...");
        return new ConcreteProduct2();
    }
}
