package com.opp_advanced.oop_polymorphic.test;

public class Admin extends Person{
    public Admin() {
    }

    public Admin(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public void work() {
        System.out.println();
    }
}
