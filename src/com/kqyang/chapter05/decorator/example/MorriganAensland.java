package com.kqyang.chapter05.decorator.example;

public class MorriganAensland {
    public static void main(String[] args) {
        Original original = new Original();
        original.display();
        Succubus succubus = new Succubus(original);
        succubus.display();
        Girl girl = new Girl(original);
        girl.display();
    }
}
