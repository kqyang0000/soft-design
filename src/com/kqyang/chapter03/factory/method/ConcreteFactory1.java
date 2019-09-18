package com.kqyang.chapter03.factory.method;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1...生产具体产品1...");
        return new ConcreteProduct1();
    }
}
