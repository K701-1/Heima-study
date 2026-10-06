package com.opp_advanced.oopextends.test1;

public class Test {
    /*
        继承：面向对象的三大特征之一，子类可以继承父类的属性和方法。
            作用：代码复用，提高代码的可维护性。
            语法：class 子类名 extends 父类名 {//子类自己的属性和方法}
    */
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "张斯斯";
        s.age = 18;
        s.grade = "高三";

        System.out.println(s.name + " " + s.age + " " + s.grade);
        s.eat();
        s.study();

        System.out.println("----------");

        Teacher t = new Teacher();
        t.name = "张老师";
        t.age = 30;
        t.subject = "计算机";
        System.out.println(t.name + " " + t.age + " " + t.subject);
        t.teach();
        t.eat();
    }
}
