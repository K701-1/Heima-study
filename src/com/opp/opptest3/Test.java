package com.opp.opptest3;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();

        t.name = "张三";
        t.age = 30;
        System.out.println(t.name + " " + t.age);

        t.teach();
        t.eat();
        t.sleep();
    }
}
