package com.kqyang.chapter04.adapter.clazz;

import com.kqyang.chapter04.adapter.Adaptee;
import com.kqyang.chapter04.adapter.Target;

public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specialRequest();
    }
}
