package com.kqyang.chapter05.composite.example;

public class ShoppingTest {
    public static void main(String[] args) {
        float s = 0;
        Bags bigBag, mediumBag, smallRedBag, smallWhiteBag;
        Goods sp;
        bigBag = new Bags("大袋子");
        mediumBag = new Bags("中袋子");
        smallRedBag = new Bags("小红袋子");
        smallWhiteBag = new Bags("小白袋子");
        sp = new Goods("婺源特产", 2, 7.9f);
        smallRedBag.add(sp);
        sp = new Goods("婺源地图", 1, 9.9f);
        smallWhiteBag.add(sp);
        sp = new Goods("婺源香菇", 2, 6.8f);
        smallWhiteBag.add(sp);
        sp = new Goods("韶关红茶", 3, 180);
        smallWhiteBag.add(sp);
        sp = new Goods("景德镇瓷器", 1, 380);
        mediumBag.add(sp);
        mediumBag.add(smallRedBag);
        sp = new Goods("李宁运动鞋", 1, 198);
        bigBag.add(sp);
        bigBag.add(smallWhiteBag);
        bigBag.add(mediumBag);
        System.out.println("您选购的商品有：");
        bigBag.show();
        s = bigBag.calculation();
        System.out.println("要支付的总价是：" + s + " 元");
    }
}
