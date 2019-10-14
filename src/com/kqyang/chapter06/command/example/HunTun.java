package com.kqyang.chapter06.command.example;

public class HunTun implements Breakfast {
    private HunTunChef receiver;

    public HunTun() {
        this.receiver = new HunTunChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
