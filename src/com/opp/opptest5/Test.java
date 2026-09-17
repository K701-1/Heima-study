package com.opp.opptest5;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.setName("旺财");
        d.setAge(3);
        System.out.println(d.getName() + " " + d.getAge());

        d.eat();
    }
}
