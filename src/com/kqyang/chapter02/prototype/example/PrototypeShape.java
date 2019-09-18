package com.kqyang.chapter02.prototype.example;

public class PrototypeShape {
    public static void main(String[] args) {
        PrototypeManager pm = new PrototypeManager();
        Shape obj1 = pm.getShape("Circle");
        obj1.countArea();
        Shape obj2 = pm.getShape("Square");
        obj2.countArea();
    }
}