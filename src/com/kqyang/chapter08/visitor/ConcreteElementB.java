package com.kqyang.chapter08.visitor;

public class ConcreteElementB implements Element {
    @Override
    public void accpet(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "具体操作B的操作";
    }
}
