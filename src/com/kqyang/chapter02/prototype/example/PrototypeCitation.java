package com.kqyang.chapter02.prototype.example;

public class PrototypeCitation {

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation obj1 = new Citation("张三", "同学：再2019学年第一学期中表现优秀，被评为三好学生。", "软件工程学院");
        obj1.display();
        Citation obj2 = obj1.clone();
        obj2.display();
        obj2.setName("李四");
        obj2.display();
    }
}