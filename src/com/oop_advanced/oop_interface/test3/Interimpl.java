package com.oop_advanced.oop_interface.test3;

public class Interimpl extends Person implements Inter1, Inter2 {
    /*
    * 如果父类Person也是一个抽象类的话，那么在子类当中，需要把所有的抽象方向进行抽象，要么子类本身也是一个抽象类
    * 如果在重写的时候出现了重复的抽象方法，此时我们只要重写一次就可以了
    */
    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void function1() {
        System.out.println("function1");
    }

    @Override
    public void function2() {
        System.out.println("function2");
    }
}
