package com.kqyang.chapter06.strategy.example;

public class Kitchen {
    // 抽象策略
    private CrabCooking strategy;

    public void cookingMethod() {
        strategy.cookingMethod();
    }

    public CrabCooking getStrategy() {
        return strategy;
    }

    public void setStrategy(CrabCooking strategy) {
        this.strategy = strategy;
    }
}
