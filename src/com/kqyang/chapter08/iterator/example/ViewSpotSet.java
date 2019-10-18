package com.kqyang.chapter08.iterator.example;

public interface ViewSpotSet {
    void add(WyViewSpot spot);

    void remove(WyViewSpot spot);

    ViewSpotIterator getIterator();
}
