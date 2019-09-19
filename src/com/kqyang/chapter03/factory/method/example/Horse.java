package com.kqyang.chapter03.factory.method.example;

import javax.swing.*;
import java.awt.*;

public class Horse implements Animal {
    JScrollPane sp;
    JFrame jf = new JFrame("工厂方法模式测试");

    public Horse() {
        Container container = jf.getContentPane();
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(1, 1));
        jp.setBorder(BorderFactory.createTitledBorder("动物：马"));
        sp = new JScrollPane(jp);
        container.add(sp, BorderLayout.CENTER);
        JLabel jl = new JLabel(new ImageIcon("src/image/A_Horse.jpg"));
        jp.add(jl);
        jf.pack();
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void show() {
        jf.setVisible(true);
    }
}
