package com.kqyang.chapter05.facade.example;

import javax.swing.*;
import java.awt.*;

public class WySpecialtyFacade {
    public static void main(String[] args) {
        JFrame f = new JFrame("外观模式：婺源特产选择测试");
        Container cp = f.getContentPane();
        WySpecialty wys = new WySpecialty();
        JScrollPane treeView = new JScrollPane(wys.tree);
        JScrollPane scrollPane = new JScrollPane(wys.label);
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, treeView, scrollPane);
        splitPane.setDividerLocation(230);
        splitPane.setOneTouchExpandable(true);
        cp.add(splitPane);
        f.setSize(650, 350);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
