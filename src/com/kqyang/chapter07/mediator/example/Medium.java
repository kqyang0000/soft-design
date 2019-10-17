package com.kqyang.chapter07.mediator.example;

public interface Medium {
    void register(Customer member);

    void relay(String from, String ad);
}
