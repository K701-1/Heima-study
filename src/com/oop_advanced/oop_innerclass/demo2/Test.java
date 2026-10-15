package com.oop_advanced.oop_innerclass.demo2;

public class Test {
    /*
    编写成员内部类的注意点：
        1. 成员内部类可以被一些修饰符所修饰，比如： private，默认，protected，public，static等
        2. 在成员内部类里面，JDK16之前不能定义静态变量，JDK 16开始才可以定义静态变量。

    获取成员内部类对象的两种方式：
        方式一：外部类编写方法，对外提供内部类对象（private）
        方式二：直接创建
        格式：外部类名.内部类名 对象名 = 外部类对象.内部类对象;
        范例：Outer.Inner oi = new Outer().new Inner();
    */

    public static void main(String[] args) {
        //链式编程
        System.out.println(new Outer().name);

        //public创建方法
        //Outer.Inner oi = new Outer().new Inner();

        //private创建方法
        //创建外部类对象
        Outer o = new Outer();
        //调用外部类方法调用私有内部类对象
        Object oi = o.getInner();
        System.out.println(o.getInner());
    }
}
