package com.oppadvanced.staticvariabletest1;

public class Test {
    public static void main(String[] args) {
        /*
            static需要掌握的内容：
                1。静态变量，被当前所有对象共享
                    共享：赋值只需要一次；只要有一个对象修改了，其他对象的值都会改变
                2.调用方式：
                    1.通过对象名调用
                    2.通过类名调用（推荐）
        */

        // 静态变量，被当前所有对象共享，即Student类所有对象共享一个teacherName变量
        Student.teacherName = "晓雯老师";

        Student stu1 = new Student();
        stu1.name = "张施施";
        stu1.age = 18;

        Student stu2 = new Student();
        stu2.name = "王丹丹";
        stu2.age = 19;

        System.out.println(stu1.name + " " + stu1.age + " " + Student.teacherName);
        System.out.println(stu2.name + " " + stu2.age + " " + Student.teacherName);
    }
}
