package com.opp_advanced.oop_extends.test7;

public class Test {
    /*
        按照下面需求写JavaBean
        学生：属性：姓名、年龄
        当我们在学校不认识一个同学时，都会称呼对方：同学
        所有现在认为同学默认名字：同学，默认年龄：18

        this()：调用本类的其他构造方法
        细节：
            如果子类中有多个构造方法，不能用this()互相调用，一定要预留一个调用父类的构造方法
            如果构造方法中写上了this()，就不能再写super()，系统也不会自动添加
            默认this()写在构造方法的第一行
    */

    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.name + ", " + stu.age);
    }
}
