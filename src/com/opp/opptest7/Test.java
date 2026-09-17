package com.opp.opptest7;

public class Test {

    /*
    构造方法是在创建对象时由虚拟机自己调用的
        如果没有定义构造方法，系统会给出一个默认无参的构造方法
        如果自己写了任意构造方法，系统将不再给出默认无参的构造方法
        带参的构造方法和无参的构造方法，两者方法名相同，但参数不同，称为构造方法的重载
    */

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName() + " " + s.getAge() + " " + s.getHeight() + " " + s.getWeight());


        Student ss = new Student("张三", 18, 175, 75);
        System.out.println(ss.getName() + " " + ss.getAge() + " " + ss.getHeight() + " " + ss.getWeight());
    }
}
