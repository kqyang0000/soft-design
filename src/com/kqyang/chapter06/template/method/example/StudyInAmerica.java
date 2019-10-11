package com.kqyang.chapter06.template.method.example;

public class StudyInAmerica extends StudyAbroad {
    @Override
    public void lookingForSchool() {
        System.out.println("一.索取学校资料");
    }

    @Override
    public void applyForEnrol() {
        System.out.println("二.入学申请");
    }

    @Override
    public void arriving() {
        System.out.println("六.抵达");
    }
}
