package com.kqyang.chapter02.singleton.example;

public class President {
    private static volatile President instance = null;

    private President() {
        System.out.println("产生一个总统");
    }

    public static synchronized President getInstance() {
        if (instance == null) {
            instance = new President();
        } else {
            System.out.println("已经有一个总统，不能再产生新总统");
        }
        return instance;
    }

    public void getName() {
        System.out.println("我是美国总统：特朗普");
    }
}
