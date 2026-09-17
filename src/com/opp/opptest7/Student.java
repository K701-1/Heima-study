package com.opp.opptest7;

public class Student {
    private String name;
    private int age;
    private int height;
    private int weight;

    //构造方法
    //习惯：空参 带全部参数构造方法 都要写出来

    //空参构造方法:一般没有内容（空着）
    public Student() {
//        System.out.println("空参构造方法");
    }

    //带全部参数的构造方法
    public Student(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
//        System.out.println("带全部参数的构造方法");
    }

    //set/get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
