package com.opp.ooptest1;

public class Test {

    /*
    描述一类事物的类叫JavaBean类 格式：public class 类名 {}

    带有main方法的类加测试类
    JavaBean类可以写属性和行为
    */

    public static void main(String[] args) {
        //创建对象记录第一只小狗信息
        //格式： 类名 对象名 = new 类名();

        //创建一个对象
        Dog d1 = new Dog();
        d1.name = "旺财";
        d1.age = 2;
        d1.weight = 5.5;
        d1.color = "yellow";

        System.out.println(d1.name + " " + d1.age + " " + d1.weight + " " + d1.color);

        //创建第二个对象
        Dog d2 = new Dog();
        d2.name = "小黑";
        d2.age = 1;
        d2.weight = 4.0;
        d2.color = "black";

        System.out.println(d2.name + " " + d2.age + " " + d2.weight + " " + d2.color);
    }
}