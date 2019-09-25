package com.kqyang.chapter04.bridge;

public class BridgeTest {

    public static void main(String[] args) {
        implementor impl = new ConcreteImplementorA();
        RefinedAbstraction re = new RefinedAbstraction(impl);
        re.operation();
    }
}
