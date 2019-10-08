package com.kqyang.chapter05.decorator.example;

public class Girl extends Changer {
    public Girl(Morrigan morrigan) {
        super(morrigan);
    }

    @Override
    public void display() {
        setChanger();
        super.display();
    }

    private void setChanger(){
        ((Original) super.morrigan).setImage("Morrigan2.jpg");
    }
}
