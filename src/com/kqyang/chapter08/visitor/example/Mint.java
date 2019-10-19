package com.kqyang.chapter08.visitor.example;

public class Mint implements Company {
    @Override
    public String create(Paper paper) {
        return "纸币";
    }

    @Override
    public String create(Cuprum cuprum) {
        return "铜币";
    }
}
