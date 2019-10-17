package com.kqyang.chapter07.mediator.example;

public class Seller extends Customer {
    public Seller(String name) {
        super(name);
        clientWindow(50, 100);
    }

    @Override
    public void send(String ad) {
        receiveArea.append("我(卖方)说：" + ad + "\n");
        receiveArea.setCaretPosition(receiveArea.getText().length());
        medium.relay(name, ad);
    }

    @Override
    public void receive(String from, String ad) {
        receiveArea.append(from + "说：" + ad + "\n");
        receiveArea.setCaretPosition(receiveArea.getText().length());
    }
}
