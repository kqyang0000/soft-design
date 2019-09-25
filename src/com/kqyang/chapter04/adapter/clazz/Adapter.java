package com.kqyang.chapter04.adapter.clazz;

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        specialRequest();
    }
}
