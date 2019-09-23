package com.kqyang.chapter03.abstracts.factory;

import javax.swing.*;
import java.awt.*;

public class Cattle implements Animal {

    JScrollPane sp;
    JFrame jf = new JFrame("抽象工厂模式测试");

    public Cattle() {
        Container container = jf.getContentPane();
        JPanel jl = new JPanel();
        jl.setLayout(new GridLayout(1, 1));
        jl.setBorder(BorderFactory.createTitledBorder("动物：牛"));
        sp = new JScrollPane();
        container.add(sp, BorderLayout.CENTER);
        JLabel ll = new JLabel(new ImageIcon("src/image/A_Cattle.jpg"));
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
