package com.kqyang.chapter04.proxy;

public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void preRequest() {
        System.out.println("访问真实主题之前的处理...");
    }

    private void postRequest() {
        System.out.println("访问真实主题之后的处理...");
    }
}
