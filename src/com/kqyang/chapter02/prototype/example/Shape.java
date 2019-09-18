package com.kqyang.chapter02.prototype.example;

public interface Shape extends Cloneable{
    Object clone();

    void countArea();
}