package com.kqyang.chapter08.iterator.example;

public interface ViewSpotIterator {
    boolean hasNext();

    WyViewSpot first();

    WyViewSpot next();

    WyViewSpot previous();

    WyViewSpot last();
}
