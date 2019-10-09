package com.kqyang.chapter05.flyweight.example;

import java.awt.*;

public class BlackPieces implements ChessPieces {
    @Override
    public void downPieces(Graphics g, Point p) {
        g.setColor(Color.BLACK);
        g.fillOval(p.x, p.y, 30, 30);
    }
}
