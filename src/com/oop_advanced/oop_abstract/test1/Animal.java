package com.oop_advanced.oop_abstract.test1;

public abstract class Animal {
    private String name;
    private String color;

    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 抽象方法:强制子类重写，否则直接报错
    //alt + 回车 IDEA自动修复错误
    public abstract void eat();

    public void drink() {
        System.out.println("喝水");
    }


}
