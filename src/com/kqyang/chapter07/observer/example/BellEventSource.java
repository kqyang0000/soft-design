package com.kqyang.chapter07.observer.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BellEventSource {
    private List<BellEventListener> listener;

    public BellEventSource() {
        this.listener = new ArrayList<>(32);
    }

    public void addPersonListener(BellEventListener ren) {
        listener.add(ren);
    }

    public void ring(boolean sound) {
        String type = sound ? "上课铃" : "下课铃";
        System.out.println(type + "响");
        RingEvent event = new RingEvent(this, sound);
        notifies(event);
    }

    protected void notifies(RingEvent e) {
        BellEventListener ren = null;
        Iterator<BellEventListener> iterator = listener.iterator();
        while (iterator.hasNext()) {
            ren = iterator.next();
            ren.heardBell(e);
        }
    }
}
