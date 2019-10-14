package com.kqyang.chapter06.command.example;

import javax.swing.*;

public class HeFenChef extends JFrame {
    private JLabel l = new JLabel();

    public HeFenChef() {
        super("煮河粉");
        l.setIcon(new ImageIcon("src/image/HeFen.jpg"));
        this.add(l);
        this.setLocation(200, 280);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void cooking() {
        this.setVisible(true);
    }
}
