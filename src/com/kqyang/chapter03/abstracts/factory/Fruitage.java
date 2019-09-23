package com.kqyang.chapter03.abstracts.factory;

import javax.swing.*;
import java.awt.*;

public class Fruitage implements Plant {

    JScrollPane sp;
    JFrame jf = new JFrame("抽象工厂模式测试");

    public Fruitage() {
        Container container = jf.getContentPane();
        JPanel jl = new JPanel();
        jl.setLayout(new GridLayout(1, 1));
        jl.setBorder(BorderFactory.createTitledBorder("植物：水果"));
        sp = new JScrollPane(jl);
        container.add(sp, BorderLayout.CENTER);
        JLabel ll = new JLabel(new ImageIcon("src/image/P_Fruitage.jpg"));
        jl.add(ll);
        jf.pack();
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void show() {
        jf.setVisible(true);
    }
}
