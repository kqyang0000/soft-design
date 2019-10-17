package com.kqyang.chapter07.observer.mediator;

public class ConcreteColleague1 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发送请求");
        mediator.relay(this);
    }
}
