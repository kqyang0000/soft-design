package com.kqyang.chapter07.observer.example;

public class BellEventTest {
    public static void main(String[] args) {
        BellEventSource bell = new BellEventSource();
        bell.addPersonListener(new TeacherEventListener());
        bell.addPersonListener(new StudentEventListener());
        bell.ring(true);
        System.out.println("---------------");
        bell.ring(false);
    }
}
