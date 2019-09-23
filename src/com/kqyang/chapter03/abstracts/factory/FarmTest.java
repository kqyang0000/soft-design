package com.kqyang.chapter03.abstracts.factory;

public class FarmTest {
    public static void main(String[] args) {
        Farm farm = (Farm) ReadXML.getObject();
        Animal animal = farm.newAnimal();
        Plant plant = farm.newPlant();
        animal.show();
        plant.show();
    }
}
