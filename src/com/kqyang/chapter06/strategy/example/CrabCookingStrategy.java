package com.kqyang.chapter06.strategy.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CrabCookingStrategy implements ItemListener {
    private JFrame f;
    private JRadioButton qz, hs;
    private JPanel centerJP, southJP;
    private Kitchen cf;
    private CrabCooking qzx, hsx;

    public CrabCookingStrategy() {
        f = new JFrame("策略模式在大闸蟹做菜中的应用");
        f.setBounds(100, 100, 500, 400);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        southJP = new JPanel();
        centerJP = new JPanel();
        f.add("South", southJP);
        f.add("Center", centerJP);
        qz = new JRadioButton("清蒸大闸蟹");
        hs = new JRadioButton("红烧大闸蟹");
        qz.addItemListener(this);
        hs.addItemListener(this);
        ButtonGroup group = new ButtonGroup();
        group.add(qz);
        group.add(hs);
        southJP.add(qz);
        southJP.add(hs);

        cf = new Kitchen();
        qzx = new SteamedCrabs();
        hsx = new BraisedCrabs();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JRadioButton b = (JRadioButton) e.getSource();
        if (b == qz) {
            cf.setStrategy(qzx);
            cf.cookingMethod();
        } else if (b == hs) {
            cf.setStrategy(hsx);
            cf.cookingMethod();
        }
        centerJP.removeAll();
        centerJP.repaint();
        centerJP.add((Component) cf.getStrategy());
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CrabCookingStrategy();
    }
}