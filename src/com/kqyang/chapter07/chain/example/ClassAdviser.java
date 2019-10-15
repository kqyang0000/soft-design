package com.kqyang.chapter07.chain.example;

public class ClassAdviser extends Leader {
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 2) {
            System.out.println("班主任批准请加" + leaveDays + "天");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("没有人批准该假条");
            }
        }
    }
}
