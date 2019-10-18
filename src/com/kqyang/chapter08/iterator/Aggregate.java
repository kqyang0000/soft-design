package com.kqyang.chapter08.iterator;

public interface Aggregate {
    void add(Object obj);

    void remove(Object obj);

    Iterator getIterator();
}
