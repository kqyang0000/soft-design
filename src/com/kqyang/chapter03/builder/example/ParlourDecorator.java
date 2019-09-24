package com.kqyang.chapter03.builder.example;

public class ParlourDecorator {
    public static void main(String[] args) {
        Decorator d = (Decorator) ReadXML.getObject();
        ProjectManager manager = new ProjectManager(d);
        Parlour parlour = manager.decorate();
        parlour.show();
    }
}
