package com.kqyang.chapter07.state.example.thread;

public class Runnable extends ThreadState {
    public Runnable() {
        stateName = "就绪状态";
        System.out.println("当前线程处于：就绪状态");
    }

    public void getCPU(ThreadContext hj) {
        System.out.println("获得CUP时间-->");
        if ("就绪状态".equals(stateName)) {
            hj.setState(new Running());
        } else {
            System.out.println("当前线程不是就绪状态，不能获取CPU");
        }
    }
}
