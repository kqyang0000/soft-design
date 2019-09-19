package com.kqyang.chapter03.factory.method.example;

public class HorseFarm implements AnimalFarm {
    @Override
    public Animal newAnimal() {
        System.out.println("新马出生");
        return new Horse();
    }
}
