package com.kqyang.chapter04.bridge.example;

public class Wallet extends Bag {
    @Override
    public String getName() {
        return color.getColor() + "Wallet";
    }
}
