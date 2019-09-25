package com.kqyang.chapter04.adapter.example;

public class ElectricAdapter implements Motor {
    private ElectricMotor electricMotor;

    public ElectricAdapter() {
        electricMotor = new ElectricMotor();
    }

    @Override
    public void drive() {
        electricMotor.electricDrive();
    }
}
