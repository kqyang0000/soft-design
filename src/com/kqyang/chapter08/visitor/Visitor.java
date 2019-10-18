package com.kqyang.chapter08.visitor;

public interface Visitor {
    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}
