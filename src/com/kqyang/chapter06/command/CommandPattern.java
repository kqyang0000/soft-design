package com.kqyang.chapter06.command;

public class CommandPattern {
    public static void main(String[] args) {
        Command command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);
        System.out.println("客户访问调用者的call()方法...");
        invoker.call();
    }
}
