package com.kqyang.chapter08.iterator;

public class IteratorPattern {
    public static void main(String[] args) {
        ConcreteAggregate ag = new ConcreteAggregate();
        ag.add("中山大学");
        ag.add("清华大学");
        ag.add("北京大学");
        ag.add("人民大学");
        System.out.println("聚合的内容有：");
        Iterator iterator = ag.getIterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj.toString() + "\t");
        }
        Object first = iterator.first();
        System.out.println("第一个大学是：" + first.toString());
    }
}
