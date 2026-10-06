package com.opp_advanced.oopextends.test6;

public class Test {
    /*
        继承构造方法细节：
            子类构造方法第一行，有一个默认的super()，用于调用父类的无参构造方法，JVM会自动加上
            如果想要访问父类的带参构造，super(参数)必须手动写上，不能省略
            在创建对象时，先执行父类的构造方法，再执行子类的构造方法
            super()最好写在子类构造方法的第一行
    */
    public static void main(String[] args) {
        /*
            根据下面描述定义继承结构：
                学生：
                    属性：姓名、年龄、年级
                老师：
                    属性：姓名、年龄、学科
        */

        Student stu = new Student("张三", 18, "大一");
        System.out.println(stu.name + ", " + stu.age + ", " + stu.grade);

    }
}
