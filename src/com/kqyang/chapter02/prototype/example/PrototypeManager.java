package com.kqyang.chapter02.prototype.example;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
    private Map<String, Shape> ht = new HashMap<>(16);

    public PrototypeManager() {
        ht.put("Circle", new Circle());
        ht.put("Square", new Square());
    }

    public void addShape(String key, Shape shape) {
        ht.put(key, shape);
    }

    public Shape getShape(String key) {
        Shape shape = ht.get(key);
        return (Shape) shape.clone();
    }
}