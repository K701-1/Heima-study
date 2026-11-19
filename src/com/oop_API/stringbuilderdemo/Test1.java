package com.oop_API.stringbuilderdemo;

public class Test1 {
    public static void main(String[] args) {
        /*
        StringBuilder的构造方法:
            public StringBuilder()                空参构造
            public StringBuilder(String str)      带参构造

        StringBuilder的常见成员方法:
            append(任意类型)          添加数据
            reverse()               反转
            length()            获取长度
            toString()              变回字符串

        */

        //1.创建StringBuilder对象（容器）   (空参构造)
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);
        System.out.println(sb1.length());

        System.out.println("-----------------");

        //2.创建StringBuilder对象（容器）   (带参构造)
        StringBuilder sb2 = new StringBuilder("abc");
        //添加数据
        sb2.append("aaa");
        System.out.println(sb2);
        //反转
        sb2.reverse();
        System.out.println(sb2);
        //获取长度
        System.out.println(sb2.length());
        //变回字符串
        String res = sb2.toString();
        System.out.println(res);

    }
}
