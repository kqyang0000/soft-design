package com.kqyang.chapter05.flyweight.example;

import java.util.ArrayList;
import java.util.List;

public class WeightFactory {
    private List<ChessPieces> qz;

    public WeightFactory() {
        qz = new ArrayList<>(32);
        WhitePieces w = new WhitePieces();
        qz.add(w);
        BlackPieces b = new BlackPieces();
        qz.add(b);
    }

    public ChessPieces getChessPieces(String type) {
        if (type.equalsIgnoreCase("w")) {
            return qz.get(0);
        } else if (type.equalsIgnoreCase("b")) {
            return qz.get(1);
        } else {
            return null;
        }
    }
}
