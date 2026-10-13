package com.opp_advanced.oop_interface.test4;

public abstract class Coach extends Person {

    public abstract void teach();

    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
}
