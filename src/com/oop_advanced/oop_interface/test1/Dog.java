package com.oop_advanced.oop_interface.test1;

public class Dog extends Animal implements Swim {
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗正在狗刨");

    }
}
