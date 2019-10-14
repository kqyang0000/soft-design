package com.kqyang.chapter06.command.example;

public class Changfen implements Breakfast {
    private ChangfenChef receiver;

    public Changfen() {
        this.receiver = new ChangfenChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
