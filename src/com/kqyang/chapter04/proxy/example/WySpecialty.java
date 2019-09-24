package com.kqyang.chapter04.proxy.example;

import javax.swing.*;
import java.awt.*;

public class WySpecialty extends JFrame implements Specialty {

    public WySpecialty(){
        super("韶关代理婺源特产测试");
        this.setLayout(new GridLayout(1,1 ));
        JLabel jl = new JLabel(new ImageIcon("src/image/WuyuanSpecialty.jpg"));
        this.add(jl);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void display() {
        this.setVisible(true);
    }
}
