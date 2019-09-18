package com.kqyang.chapter02.prototype.example;

import java.util.Scanner;

public class Circle implements Shape {
    @Override
    public Circle clone() {
        Circle circle = null;
        try {
            circle = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("复制圆形失败");
        }
        return circle;
    }

    @Override
    public void countArea() {
        int r;
        System.out.println("这是一个圆形，请输入半径：");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt();
        System.out.println("该圆形的面积为：" + (r * r * 3.14));
    }
}