package com.kqyang.chapter05.flyweight.example;

import java.awt.*;

public class WhitePieces implements ChessPieces {
    @Override
    public void downPieces(Graphics g, Point p) {
        g.setColor(Color.WHITE);
        g.fillOval(p.x, p.y, 30, 30);
    }
}
