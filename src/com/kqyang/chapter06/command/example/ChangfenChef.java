package com.kqyang.chapter06.command.example;

import javax.swing.*;

public class ChangfenChef extends JFrame {
    private JLabel l = new JLabel();

    public ChangfenChef() {
        super("煮肠粉");
        l.setIcon(new ImageIcon("src/image/ChangFen.jpg"));
        this.add(l);
        this.setLocation(30, 30);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void cooking() {
        this.setVisible(true);
    }
}
