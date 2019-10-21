package com.kqyang.chapter08.interpreter;

import java.util.HashSet;
import java.util.Set;

public class TerminalExpression implements Expression {
    private Set<String> set = new HashSet<>();

    public TerminalExpression(String[] data) {
        for (String info : data) {
            set.add(info);
        }
    }

    @Override
    public boolean interpret(String info) {
        if (set.contains(info)) {
            return true;
        }
        return false;
    }
}
