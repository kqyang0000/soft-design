package com.kqyang.chapter05.decorator;

public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component){
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    private void addedFunction(){
        System.out.println("为具体构建角色增加额外的功能 addedFunction()");
    }
}
