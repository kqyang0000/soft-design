package com.kqyang.chapter07.chain;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("two".equalsIgnoreCase(request)) {
            System.out.println("具体处理者2负责处理该请求");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("无人处理该请求");
            }
        }
    }
}
