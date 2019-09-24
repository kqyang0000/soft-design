package com.kqyang.chapter04.proxy.example;

public class SgProxy implements Specialty {
    private WySpecialty wy = new WySpecialty();

    private void preRequest(){
        System.out.println("代理开始执行");
    }

    private void postRequest(){
        System.out.println("代理执行完毕");
    }

    @Override
    public void display() {
        preRequest();
        wy.display();
        postRequest();
    }
}
