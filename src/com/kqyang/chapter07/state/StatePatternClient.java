package com.kqyang.chapter07.state;

public class StatePatternClient {
    public static void main(String[] args) {
        Context context = new Context();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }
}
