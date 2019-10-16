package com.kqyang.chapter07.observer.extend;

public class CrudeOilFutures {
    public static void main(String[] args) {
        OilFutures oil = new OilFutures();
        Bull bull = new Bull();
        Bear bear = new Bear();
        oil.addObserver(bull);
        oil.addObserver(bear);
        oil.setPrice(10);
        oil.setPrice(-8);
    }
}
