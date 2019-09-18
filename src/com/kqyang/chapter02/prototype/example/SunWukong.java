package com.kqyang.chapter02.prototype.example;

import javax.swing.*;
import java.awt.*;

public class SunWukong extends JPanel implements Cloneable {

    public SunWukong() {
        JLabel jl = new JLabel(new ImageIcon("src/image/Wukong.jpg"));
        this.add(jl);
    }

    @Override
    protected SunWukong clone() {
        SunWukong sun = null;
        try {
            sun = (SunWukong) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("复制悟空失败");
        }
        return sun;
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame("原型模式测试");
        jf.setLayout(new GridLayout(1, 2));
        Container container = jf.getContentPane();
        SunWukong obj1 = new SunWukong();
        container.add(obj1);
        SunWukong obj2 = obj1.clone();
        container.add(obj2);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
