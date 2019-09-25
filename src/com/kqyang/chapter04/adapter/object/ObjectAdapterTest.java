package com.kqyang.chapter04.adapter.object;

import com.kqyang.chapter04.adapter.Adaptee;
import com.kqyang.chapter04.adapter.Target;

public class ObjectAdapterTest {
    public static void main(String[] args) {
        System.out.println("对象适配器模式测试");
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
