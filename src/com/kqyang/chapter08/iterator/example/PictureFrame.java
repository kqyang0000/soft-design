package com.kqyang.chapter08.iterator.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PictureFrame extends JFrame implements ActionListener {
    private ViewSpotSet ag;
    ViewSpotIterator it;
    WyViewSpot ob;

    public PictureFrame() {
        super("中国最美乡村部分风景图");
        ag = new WyViewSpotSet();
        ag.add(new WyViewSpot("江湾", "美"));
        ag.add(new WyViewSpot("李坑", "美"));
        ag.add(new WyViewSpot("思溪延村", "美"));
        ag.add(new WyViewSpot("晓起村", "美"));
        ag.add(new WyViewSpot("菊径村", "美"));
        ag.add(new WyViewSpot("彩虹桥", "美"));
        ag.add(new WyViewSpot("卧龙谷", "美"));
        it = ag.getIterator();
        ob = it.first();
        this.showPicture(ob.getName(), ob.getIntroduce());
    }

    public void showPicture(String name, String introduce) {
        Container cp = this.getContentPane();
        JPanel picturePanel = new JPanel();
        JPanel controlPanel = new JPanel();
        String fileName = "src/image/" + name + ".jpg";
        JLabel lb = new JLabel(name, new ImageIcon(fileName), JLabel.CENTER);
        JTextArea ta = new JTextArea(introduce);
        lb.setHorizontalTextPosition(JLabel.CENTER);
        lb.setVerticalTextPosition(JLabel.TOP);
        lb.setFont(new Font("宋体", Font.BOLD, 20));
        ta.setLineWrap(true);
        ta.setEditable(false);
        picturePanel.setLayout(new BorderLayout(5, 5));
        picturePanel.add("Center", lb);
        picturePanel.add("South", ta);
        JButton first, last, next, previous;
        first = new JButton("第一张");
        next = new JButton("下一张");
        previous = new JButton("上一张");
        last = new JButton("最末张");
        first.addActionListener(this);
        next.addActionListener(this);
        previous.addActionListener(this);
        last.addActionListener(this);
        controlPanel.add(first);
        controlPanel.add(next);
        controlPanel.add(previous);
        controlPanel.add(last);
        cp.add("Center", picturePanel);
        cp.add("South", controlPanel);
        this.setSize(630, 550);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if ("第一张".equals(command)) {
            ob = it.first();
            this.showPicture(ob.getName(), ob.getIntroduce());
        } else if ("下一张".equals(command)) {
            ob = it.next();
            this.showPicture(ob.getName(), ob.getIntroduce());
        } else if ("上一张".equals(command)) {
            ob = it.previous();
            this.showPicture(ob.getName(), ob.getIntroduce());
        } else if ("最末张".equals(command)) {
            ob = it.last();
            this.showPicture(ob.getName(), ob.getIntroduce());
        }
    }
}
