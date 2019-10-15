package com.kqyang.chapter07.state.example;

public abstract class AbstractState {
    protected ScoreContext hj;
    protected String stateName;
    protected int score;

    public abstract void checkState();

    public void addScore(int x) {
        score += x;
        System.out.println("加上" + x + "分,\t当前分数:" + score);
        checkState();
        System.out.println("分,\t当前状态:" + hj.getState().stateName);
    }
}
