package com.kqyang.chapter07.mediator.example;

public class DatingPlatform {
    public static void main(String[] args) {
        EstateMedium md = new EstateMedium();
        Customer member1, member2;
        member1 = new Seller("张三(卖方)");
        member2 = new Buyer("李四(买方)");
        md.register(member1);
        md.register(member2);
    }
}
