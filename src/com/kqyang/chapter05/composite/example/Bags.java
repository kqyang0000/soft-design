package com.kqyang.chapter05.composite.example;

import java.util.ArrayList;
import java.util.List;

public class Bags implements Articles {
    private String name;
    private List<Articles> bags = new ArrayList<>(32);

    public Bags(String name) {
        this.name = name;
    }

    public void add(Articles a) {
        bags.add(a);
    }

    public void remove(Articles a) {
        bags.remove(a);
    }

    public Articles getChild(int i) {
        return bags.get(i);
    }

    @Override
    public float calculation() {
        float s = 0;
        for (Articles good : bags) {
            s += good.calculation();
        }
        return s;
    }

    @Override
    public void show() {
        for (Articles good : bags) {
            good.show();
        }
    }
}
