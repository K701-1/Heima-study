package com.opp_advanced.oopextends.test8;

public class BachelorStudent extends Student{
    public BachelorStudent() {
    }

    public BachelorStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println("攻读学士学位");
    }
}
