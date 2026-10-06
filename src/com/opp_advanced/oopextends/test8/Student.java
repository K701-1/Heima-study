package com.opp_advanced.oopextends.test8;

public class Student extends Person{
    private String grade;

    //构造方法

    public Student() {
    }

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    //get\set
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void study() {
        System.out.println("学习");
    }
}
