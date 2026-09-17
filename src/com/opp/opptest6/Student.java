package com.opp.opptest6;

public class Student {

    //this关键字

    private String name;  //成员变量
    private int age;
    private int height;
    private int weight;

    public void study() {
        System.out.println(name + "正在学习");
    }

    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;  //this.name:成员变量  name:局部变量
    }

    //age
    public int getAge() {
        return age;
    }

    public void setAge(int num) {  //num 局部变量
        age = num;
    }

    //height
    public int getHeight() {
        return height;
    }

    public void setHeight(int num) {
        height = num;
    }

    //weight
    public int getWeight() {
        return weight;
    }

    public void setWeight(int num) {
        weight = num;
    }
}
