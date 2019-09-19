package com.kqyang.chapter03.factory.method.example;

public class AnimalFarmTest {
    public static void main(String[] args) {
        AnimalFarm af = (AnimalFarm) ReadXML2.getObject();
        Animal animal = af.newAnimal();
        animal.show();
    }
}
