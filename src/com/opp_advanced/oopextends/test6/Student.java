package com.opp_advanced.oopextends.test6;

public class Student extends Person{
    String grade;

    //构造方法
    public Student() {
        System.out.println("Student的无参构造方法");
    }
    //（父 + 子）构造方法
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;

        System.out.println("Student的有参构造方法");
    }
}
