package com.kqyang.chapter08.iterator.example;

import java.util.List;

public class WyViewSpotIterator implements ViewSpotIterator {
    private List<WyViewSpot> list = null;
    private int index = -1;
    WyViewSpot spot = null;

    public WyViewSpotIterator(List<WyViewSpot> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        }
        return false;
    }

    @Override
    public WyViewSpot first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public WyViewSpot next() {
        if (hasNext()) {
            spot = list.get(++index);
        }
        return spot;
    }

    @Override
    public WyViewSpot previous() {
        if (index > 0) {
            spot = list.get(--index);
        }
        return spot;
    }

    @Override
    public WyViewSpot last() {
        index = list.size() - 1;
        return list.get(index);
    }
}
