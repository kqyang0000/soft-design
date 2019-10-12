package com.kqyang.chapter06.strategy.example;

import javax.swing.*;

public class BraisedCrabs extends JLabel implements CrabCooking {
    @Override
    public void cookingMethod() {
        this.setIcon(new ImageIcon("src/image/BraisedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
