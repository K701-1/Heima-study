package com.oop_advanced.oop_innerclass.demo6;

public class Test {
    /*
        匿名内部类
          作用：少定义一个Java文件
          使用场景：需要使用一个类来实现多态，但是这个类只使用一次，那么这个类可以定义为匿名内部类
          格式：
              new 类名/接口名(){
                  重写方法
              };

        没有名字的Java类：大括号
        Swim：就是这个无名Java类实现了Swim接口
        重写方法：在大括号中要重写所有Swim的抽象方法
        创建对象：new关键字的作用是创建这个无名Java类的实例对象
    */


    public static void main(String[] args) {
        //方式一：
        goSwimming(new Swim(){
            @Override
            public void swim() {
                System.out.println("匿名内部类实现多态");
            }
        });

        //方式二：
        Swim s = new Swim(){
            @Override
            public void swim() {
                System.out.println("匿名内部类实现多态");
            }
        };
        goSwimming(s);
    }

    public static void goSwimming(Swim s) {
        s.swim();
    }
}
