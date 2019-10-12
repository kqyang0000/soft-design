package com.kqyang.chapter06.strategy.example;

import javax.swing.*;

public class SteamedCrabs extends JLabel implements CrabCooking {

    @Override
    public void cookingMethod() {
        this.setIcon(new ImageIcon("src/image/SteamedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
