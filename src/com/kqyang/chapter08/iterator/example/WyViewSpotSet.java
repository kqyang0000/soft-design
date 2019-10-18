package com.kqyang.chapter08.iterator.example;

import java.util.ArrayList;
import java.util.List;

public class WyViewSpotSet implements ViewSpotSet {
    private List<WyViewSpot> list = new ArrayList<>(32);

    @Override
    public void add(WyViewSpot spot) {
        list.add(spot);
    }

    @Override
    public void remove(WyViewSpot spot) {
        list.remove(spot);
    }

    @Override
    public ViewSpotIterator getIterator() {
        return new WyViewSpotIterator(list);
    }
}
