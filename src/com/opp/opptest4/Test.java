package com.opp.opptest4;

public class Test {
    public static void main(String[] args) {
        Cook c = new Cook();

        c.name = "张三";
        c.age = 30;
        c.cooklevel = 10;


        System.out.println(c.name + " " + c.age + " " + c.cooklevel);

        c.cooking();
    }
}
