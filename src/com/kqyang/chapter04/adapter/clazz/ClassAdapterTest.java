package com.kqyang.chapter04.adapter.clazz;

import com.kqyang.chapter04.adapter.Target;

public class ClassAdapterTest {
    public static void main(String[] args) {
        System.out.println("类适配器模式测试");
        Target target = new ClassAdapter();
        target.request();
    }
}
