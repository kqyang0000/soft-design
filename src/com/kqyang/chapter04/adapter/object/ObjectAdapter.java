package com.kqyang.chapter04.adapter.object;

import com.kqyang.chapter04.adapter.Adaptee;
import com.kqyang.chapter04.adapter.Target;

public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}
