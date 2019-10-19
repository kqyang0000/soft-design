package com.kqyang.chapter08.visitor.example;

public class Paper implements Material {
    @Override
    public String accept(Company company) {
        return company.create(this);
    }
}
