package com.kqyang.chapter06.command.example;

import javax.swing.*;

public class HunTunChef extends JFrame {
    private JLabel l = new JLabel();

    public HunTunChef() {
        super("煮馄饨");
        l.setIcon(new ImageIcon("src/image/HunTun.jpg"));
        this.add(l);
        this.setLocation(350, 50);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void cooking() {
        this.setVisible(true);
    }
}
