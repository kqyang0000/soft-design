package com.kqyang.chapter07.state;

public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是：B");
        context.setState(new ConcreteStateA());
    }
}
