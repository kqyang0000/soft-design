package com.kqyang.chapter07.state;

public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是：A");
        context.setState(new ConcreteStateB());
    }
}
