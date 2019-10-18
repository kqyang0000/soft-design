package com.kqyang.chapter08.iterator;

import java.util.List;

public class ConcreteIterator implements Iterator {
    private List<Object> list = null;
    private int index = 0;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        Object obj = list.get(index);
        return obj;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (hasNext()) {
            obj = list.get(index++);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if (index >= list.size()) {
            return false;
        }
        return true;
    }
}
