package com.kqyang.chapter07.state.example.thread;

public class Blocked extends ThreadState {
    public Blocked() {
        stateName = "阻塞状态";
        System.out.println("当前线程处于：阻塞状态");
    }

    public void resume(ThreadContext hj) {
        System.out.println("调用resume()方法-->");
        if ("阻塞状态".equals(stateName)) {
            hj.setState(new Runnable());
        } else {
            System.out.println("当前线程不是阻塞状态，不能调用resume()方法");
        }
    }
}
