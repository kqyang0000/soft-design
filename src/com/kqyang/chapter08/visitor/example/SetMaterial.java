package com.kqyang.chapter08.visitor.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SetMaterial {
    private List<Material> list = new ArrayList<>(32);

    public void add(Material material) {
        list.add(material);
    }

    public void remove(Material material) {
        list.remove(material);
    }

    public String accpet(Company company) {
        Iterator<Material> iter = list.iterator();
        String temp = "";
        while (iter.hasNext()) {
            temp += iter.next().accept(company) + " ";
        }
        return temp;
    }
}
