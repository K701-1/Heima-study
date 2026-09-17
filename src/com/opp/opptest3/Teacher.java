package com.opp.opptest3;

public class Teacher {

    //属性
    String name;
    int age;

    //行为
    //JavaBean类中的方法不写static
    public void teach(){
        System.out.println("老师在授课");
    }
    public void eat(){
        System.out.println("老师在吃饭");
    }
    public void sleep() {
        System.out.println("老师在睡觉");
    }
}
