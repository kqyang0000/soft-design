package com.kqyang.chapter04.bridge.example;

public class HandBag extends Bag {
    @Override
    public String getName() {
        return color.getColor() + "HandBag";
    }
}
