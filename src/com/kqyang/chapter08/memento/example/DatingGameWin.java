package com.kqyang.chapter08.memento.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DatingGameWin extends JFrame implements ActionListener {
    JPanel centerJP, eastJP;
    JRadioButton girl1, girl2, girl3, girl4;
    JButton button1, button2;
    String fileName;
    JLabel g;
    You you;
    GirlStack girls;

    public DatingGameWin() {
        super("利用备忘录模式设计相亲游戏");
        you = new You();
        girls = new GirlStack();
        this.setBounds(0, 0, 900, 380);
        this.setResizable(false);
        fileName = "src/image/空白.jpg";
        g = new JLabel(new ImageIcon(fileName), JLabel.CENTER);
        centerJP = new JPanel();
        centerJP.setLayout(new GridLayout(1, 4));
        centerJP.setBorder(BorderFactory.createTitledBorder("四大美女如下："));
        centerJP.add(g);
        this.add("Center", centerJP);
        eastJP = new JPanel();
        eastJP.setLayout(new GridLayout(1, 1));
        eastJP.setBorder(BorderFactory.createTitledBorder("您最爱的人是："));
        this.add("East", eastJP);
        JPanel southJP = new JPanel();
        JLabel info = new JLabel("四大美女有：沉鱼落雁之容、闭月羞花之貌，您选择谁？");
        girl1 = new JRadioButton("西施", true);
        girl2 = new JRadioButton("貂蝉");
        girl3 = new JRadioButton("王昭君");
        girl4 = new JRadioButton("杨玉环");
        button1 = new JButton("确定");
        button2 = new JButton("返回");
        ButtonGroup group = new ButtonGroup();
        group.add(girl1);
        group.add(girl2);
        group.add(girl3);
        group.add(girl4);
        southJP.add(info);
        southJP.add(girl1);
        southJP.add(girl2);
        southJP.add(girl3);
        southJP.add(girl4);
        southJP.add(button1);
        southJP.add(button2);
        button1.addActionListener(this);
        button2.addActionListener(this);
        this.add("South", southJP);
        showPicture("空白");
        you.setWifeName("空白");
        girls.push(you.createMemento());
    }

    public void showPicture(String name) {
        eastJP.removeAll();
        eastJP.repaint();
        you.setWifeName(name);
        fileName = "src/image/" + name + ".jpg";
        g = new JLabel(new ImageIcon(fileName));
        eastJP.add(g);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean ok = false;
        if (e.getSource() == button1) {
            ok = girls.push(you.createMemento());
            if (ok && girl1.isSelected()) {
                showPicture("西施");
            } else if (ok && girl2.isSelected()) {
                showPicture("貂蝉");
            } else if (ok && girl3.isSelected()) {
                showPicture("王昭君");
            } else if (ok && girl4.isSelected()) {
                showPicture("杨玉环");
            }
        } else if (e.getSource() == button2) {
            you.restoreMemento(girls.pop());
            showPicture(you.getWifeName());
        }
    }
}
