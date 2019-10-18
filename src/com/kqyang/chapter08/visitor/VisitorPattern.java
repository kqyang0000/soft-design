package com.kqyang.chapter08.visitor;

public class VisitorPattern {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        ConcreteVisitorA visitorA = new ConcreteVisitorA();
        os.accept(visitorA);
        System.out.println("------------------");
        ConcreteVisitorB visitorB = new ConcreteVisitorB();
        os.accept(visitorB);
    }
}
