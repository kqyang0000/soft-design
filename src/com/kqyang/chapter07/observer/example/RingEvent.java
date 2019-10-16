package com.kqyang.chapter07.observer.example;

import java.util.EventObject;

public class RingEvent extends EventObject {
    private boolean sound;

    public RingEvent(Object source, boolean sound) {
        super(source);
        this.sound = sound;
    }

    public boolean getSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }
}
