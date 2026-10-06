package com.opp_advanced.finaltest;

public class FinalTest1 {
    /*
        final 修饰变量，此时称为常量
            特点：1.一旦赋值就不能再改变
                 2.常量名大写，单词之间用下划线连接

            细节：
                基本数据类型：byte, short, int, long, float, double, char, boolean
                            final int a = 10; 此时变量里面记录的数据无法改变
                引用数据类型：String以及除上面8种以外的
                            final Student s = new Student();  // 此时变量 s 里面记录地址，无法改变；但对象里的属性值，可以改变
    */
    public static void main(String[] args) {
        final int num = 10;
        System.out.println(num);
        System.out.println(num - 6);

        // num = 200;  // 错误，不能修改 final 修饰的变量

        final Student STU = new Student("张三", 18);
        STU.setAge(20);
        System.out.println(STU.getAge());
    }
}
