package com.kqyang.chapter08.visitor;

public class ConcreteElementA implements Element {
    @Override
    public void accpet(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "具体元素A的操作";
    }
}
