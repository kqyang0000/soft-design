package com.kqyang.chapter04.bridge;

public abstract class Abstraction {
    protected implementor impl;

    protected Abstraction(implementor impl) {
        this.impl = impl;
    }

    public abstract void operation();
}
