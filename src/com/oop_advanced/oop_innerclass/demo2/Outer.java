package com.oop_advanced.oop_innerclass.demo2;

public class Outer {
    String name;

    private class Inner {
        static int a = 10;
    }

    public Inner getInner() {
        return new Inner();
    }
}
