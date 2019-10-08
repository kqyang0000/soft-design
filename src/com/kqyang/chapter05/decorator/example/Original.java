package com.kqyang.chapter05.decorator.example;

import javax.swing.*;
import java.awt.*;

public class Original extends JFrame implements Morrigan {
    private String t = "Morrigan0.jpg";

    public Original() {
        super("《恶魔战士》中的莫莉卡·安斯兰");
    }

    public void setImage(String t) {
        this.t = t;
    }

    @Override
    public void display() {
        this.setLayout(new FlowLayout());
        JLabel jl = new JLabel(new ImageIcon("src/image/" + t));
        this.add(jl);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
