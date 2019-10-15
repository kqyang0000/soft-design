package com.kqyang.chapter07.state.example;

public class ScoreContext {
    private AbstractState state;

    public ScoreContext() {
        this.state = new LowState(this);
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public void add(int score){
        state.addScore(score);
    }
}
