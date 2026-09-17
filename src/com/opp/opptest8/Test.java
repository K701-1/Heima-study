package com.opp.opptest8;

public class Test {
    public static void main(String[] args) {
        /*Student stu1 = new Student();
        System.out.println(stu1.getName() + " " + stu1.getAge());*/

        Student stu2 = new Student("张三", 18);
        System.out.println(stu2.getName() + " " + stu2.getAge());

        stu2.eat();
        stu2.sleep();
        stu2.study();
    }
}
