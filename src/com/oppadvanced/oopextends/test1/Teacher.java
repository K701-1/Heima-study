package com.oppadvanced.oopextends.test1;

//子类Teacher类继承Person类
public class Teacher extends Person {
    String subject;

    public void teach() {
        System.out.println(name + "正在教" + subject);
    }
}
