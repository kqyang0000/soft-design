package com.kqyang.chapter07.chain.example;

public class Dean extends Leader {
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 10) {
            System.out.println("院长批准请加" + leaveDays + "天");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("没有人批准该假条");
            }
        }
    }
}
