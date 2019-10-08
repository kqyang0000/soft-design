package com.kqyang.chapter05.decorator;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("调用具体构建角色的方法 operation()");
    }

    public ConcreteComponent(){
        System.out.println("创建具体构建角色");
    }
}
