package com.opp_advanced.oopextends.test1;

//子类继承父类Person
public class Student extends Person {
    String grade;

    public void study() {
        System.out.println(name + "正在学习");
    }
}
