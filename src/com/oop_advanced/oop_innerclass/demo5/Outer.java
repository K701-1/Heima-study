package com.oop_advanced.oop_innerclass.demo5;

public class Outer {
    int b = 20;

    public void show(){
        int a = 10;

        //局部内部类
        class Inner{
            String name;
            int age;

            public void method1(){
                System.out.println(b);
                System.out.println("method1");
            }
            public void method2(){
                System.out.println("method2");
            }
        }


        //创建局部内部类对象
        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method1();
        i.method2();
    }
}
