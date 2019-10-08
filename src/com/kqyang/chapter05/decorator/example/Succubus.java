package com.kqyang.chapter05.decorator.example;

public class Succubus extends Changer {
    public Succubus(Morrigan morrigan) {
        super(morrigan);
    }

    @Override
    public void display() {
        setChanger();
        super.display();
    }

    private void setChanger(){
        ((Original) super.morrigan).setImage("Morrigan1.jpg");
    }
}
