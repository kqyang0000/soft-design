package com.kqyang.chapter02.prototype.example;

import java.util.Scanner;

public class Square implements Shape {
    @Override
    public Square clone() {
        Square square = null;
        try {
            square = (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("复制正方形失败");
        }
        return square;
    }

    @Override
    public void countArea() {
        int a;
        System.out.println("这是一个正方形，请输入边长：");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("该正方形的面积为：" + (a * a));
    }
}
