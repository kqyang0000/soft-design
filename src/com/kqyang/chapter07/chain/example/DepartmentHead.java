package com.kqyang.chapter07.chain.example;

public class DepartmentHead extends Leader {
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 7) {
            System.out.println("系主任批准请加" + leaveDays + "天");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("没有人批准该假条");
            }
        }
    }
}
