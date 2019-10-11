package com.kqyang.chapter06.template.method.example;

public abstract class StudyAbroad {

    /**
     * 模板方法
     */
    public void templateMethod() {
        lookingForSchool();
        applyForEnrol();
        applyForPassport();
        applyForVisa();
        readyGoAbroad();
        arriving();
    }

    /**
     * 索取学校资料
     */
    public abstract void lookingForSchool();

    /**
     * 入学申请
     */
    public abstract void applyForEnrol();

    /**
     * 抵达
     */
    public abstract void arriving();

    /**
     * 办理护照
     */
    public void applyForPassport() {
        System.out.println("三.办理护照");
    }

    /**
     * 申请签证
     */
    public void applyForVisa() {
        System.out.println("四.申请签证");
    }

    /**
     * 准备机票
     */
    public void readyGoAbroad() {
        System.out.println("五.准备机票");
    }
}
