package com.kqyang.chapter06.command.example;

public class Waiter {
    private Breakfast changFen, heFen, hunTun;

    public void setChangFen(Breakfast f) {
        changFen = f;
    }

    public void setHeFen(Breakfast f) {
        heFen = f;
    }

    public void setHunTun(Breakfast f) {
        hunTun = f;
    }

    public void chooseChangFen() {
        changFen.cooking();
    }

    public void chooseHeFen() {
        heFen.cooking();
    }

    public void chooseHunTun() {
        hunTun.cooking();
    }
}
