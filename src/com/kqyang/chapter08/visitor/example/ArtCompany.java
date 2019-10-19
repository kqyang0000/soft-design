package com.kqyang.chapter08.visitor.example;

public class ArtCompany implements Company {
    @Override
    public String create(Paper paper) {
        return "讲学图";
    }

    @Override
    public String create(Cuprum cuprum) {
        return "朱熹铜像";
    }
}
