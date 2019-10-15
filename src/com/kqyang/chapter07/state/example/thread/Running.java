package com.kqyang.chapter07.state.example.thread;

public class Running extends ThreadState {
    public Running() {
        stateName = "运行状态";
        System.out.println("当前线程处于：运行状态");
    }

    public void suspend(ThreadContext hj) {
        System.out.println("调用suspend()方法-->");
        if ("运行状态".equals(stateName)) {
            hj.setState(new Blocked());
        } else {
            System.out.println("当前线程不是运行状态，不能调用suspend()方法");
        }
    }

    public void stop(ThreadContext hj) {
        System.out.println("调用stop()方法-->");
        if ("运行状态".equals(stateName)) {
            hj.setState(new Dead());
        } else {
            System.out.println("当前线程不是运行状态，不能调用stop()方法");
        }
    }
}
