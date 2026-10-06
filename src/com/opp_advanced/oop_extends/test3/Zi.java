package com.opp_advanced.oop_extends.test3;

public class Zi extends Fu {
    String name = "zi";

    public void ziShow() {
        String name = "ziShow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
