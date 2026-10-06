package com.oop_polymorphic.test;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
}
