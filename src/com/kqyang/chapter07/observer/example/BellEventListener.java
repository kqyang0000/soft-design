package com.kqyang.chapter07.observer.example;

import java.util.EventListener;

public interface BellEventListener extends EventListener {
    void heardBell(RingEvent e);
}
