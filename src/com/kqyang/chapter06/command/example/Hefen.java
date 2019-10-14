package com.kqyang.chapter06.command.example;

public class Hefen implements Breakfast {
    private HeFenChef receiver;

    public Hefen() {
        this.receiver = new HeFenChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
