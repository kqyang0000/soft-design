package com.kqyang.chapter04.bridge;

public class RefinedAbstraction extends Abstraction {

    protected RefinedAbstraction(implementor impl){
        super(impl);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化角色被访问");
        impl.operationImpl();
    }
}
