package com.kqyang.chapter02.singleton.example;

public class SingletonLazy {

    public static void main(String[] args) {
        President zt1 = President.getInstance();
        zt1.getName();
        President zt2 = President.getInstance();
        zt2.getName();
        if (zt1 == zt2) {
            System.out.println("他们是同一个人");
        } else {
            System.out.println("他们不是同一个人");
        }

    }
}