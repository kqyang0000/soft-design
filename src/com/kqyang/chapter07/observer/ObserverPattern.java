package com.kqyang.chapter07.observer;

public class ObserverPattern {
    public static void main(String[] args) {
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        Subject subject = new ConcreteSubject();
        subject.add(observer1);
        subject.add(observer2);
        subject.notifyObserver();
    }
}
