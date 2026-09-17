package com.opp.opptest5;

public class Dog {
    //私有化属性 private
    //set 和 get关键字，用于访问和修改私有属性，遵循命名规则：set + 属性名，get + 属性名

    private String name;
    private int age;

    //name
    public void setName(String value) {
        //给对象中的属性赋值
        name = value;
    }

    public String getName() {
        return name;
    }

    //age
    public void setAge(int num) {
        if (num >= 0 && num <= 15) age = num;
        else System.out.println("当前的" + num + "不合理");
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println(age + "岁的" + name + "正在吃吃吃");
    }
}
