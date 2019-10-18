package com.kqyang.chapter08.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObjectStructure {
    private List<Element> list = new ArrayList<>(32);

    public void accept(Visitor visitor) {
        Iterator<Element> iter = list.iterator();
        while (iter.hasNext()) {
            iter.next().accpet(visitor);
        }
    }

    public void add(Element element) {
        list.add(element);
    }

    public void remove(Element element) {
        list.remove(element);
    }
}
