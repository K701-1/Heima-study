package com.oop_advanced.oop_innerclass.demo3;

public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}
