package com.kqyang.chapter02.prototype.example;

public class Citation implements Cloneable {
    private String name;
    private String info;
    private String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name + info + college);
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        System.out.println("奖状复制成功");
        return (Citation) super.clone();
    }
}
