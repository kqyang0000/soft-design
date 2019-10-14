package com.kqyang.chapter06.command.example;

public class CookingCommand {
    public static void main(String[] args) {
        Breakfast food1 = new Changfen();
        Breakfast food2 = new Hefen();
        Breakfast food3 = new HunTun();
        Waiter waiter = new Waiter();
        waiter.setChangFen(food1);
        waiter.setHeFen(food2);
        waiter.setHunTun(food3);
        waiter.chooseChangFen();
        waiter.chooseHeFen();
        waiter.chooseHunTun();
    }
}
