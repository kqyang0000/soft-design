package com.kqyang.chapter06.template.method;

public abstract class AbstractClass {
    public void templateMethod() {
        specificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    public void specificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }

    public abstract void abstractMethod1();

    public abstract void abstractMethod2();
}
