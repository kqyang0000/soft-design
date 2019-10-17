package com.kqyang.chapter07.mediator.example;

import java.util.ArrayList;
import java.util.List;

public class EstateMedium implements Medium {
    private List<Customer> members = new ArrayList<>(32);

    @Override
    public void register(Customer member) {
        if (!members.contains(member)) {
            members.add(member);
            member.setMedium(this);
        }
    }

    @Override
    public void relay(String from, String ad) {
        for (Customer member : members) {
            String name = member.getName();
            if (!name.equals(from)) {
                member.receive(from, ad);
            }
        }
    }
}
