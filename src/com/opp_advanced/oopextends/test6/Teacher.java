package com.opp_advanced.oopextends.test6;

public class Teacher extends Person {
    String subject;

    //构造方法
    public Teacher() {
        System.out.println("Teacher的无参构造方法");
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;

        System.out.println("Teacher的有参构造方法");
    }

}
