package com.kqyang.chapter05.decorator;

public class Decorator implements Component {
    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
