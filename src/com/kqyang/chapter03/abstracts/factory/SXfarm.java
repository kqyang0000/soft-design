package com.kqyang.chapter03.abstracts.factory;

public class SXfarm implements Farm {
    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生");
        return new Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("水果长成");
        return new Fruitage();
    }
}
