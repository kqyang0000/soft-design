package com.kqyang.chapter07.observer;

public class ConcreteObserver1 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者1做出反应");
    }
}
