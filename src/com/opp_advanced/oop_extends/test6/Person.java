package com.opp_advanced.oop_extends.test6;

public class Person {
    String name;
    int age;

    //构造方法

    public Person() {
        System.out.println("Person的无参构造方法");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person的有参构造方法");
    }
}
