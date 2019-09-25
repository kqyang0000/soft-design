package com.kqyang.chapter04.bridge;

public class ConcreteImplementorA implements implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现化角色被访问");
    }
}
