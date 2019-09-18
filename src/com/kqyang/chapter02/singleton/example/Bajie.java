package com.kqyang.chapter02.singleton.example;

import javax.swing.*;

public class Bajie extends JPanel {
    private static Bajie instance = new Bajie();

    private Bajie() {
        JLabel jl = new JLabel(new ImageIcon("src/image/Bajie.jpg"));
        this.add(jl);
    }

    public static Bajie getInstance() {
        return instance;
    }
}