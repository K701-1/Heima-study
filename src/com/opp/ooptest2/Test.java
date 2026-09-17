package com.opp.ooptest2;

public class Test {
    public static void main(String[] args) {

        //创建学生对象
        Student s1 = new Student();
        s1.name = "武明坤";
        s1.sex = '男';
        s1.age = 22;
        s1.height = 175.5;

        //输出学生信息
        System.out.println(s1.name + " " + s1.sex + " " + s1.age + " " + s1.height);
    }
}
