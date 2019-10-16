package com.kqyang.chapter07.observer.example;

public class StudentEventListener implements BellEventListener {
    @Override
    public void heardBell(RingEvent e) {
        if (e.getSound()) {
            System.out.println("同学们，上课了...");
        } else {
            System.out.println("同学们，下课了...");
        }
    }
}
