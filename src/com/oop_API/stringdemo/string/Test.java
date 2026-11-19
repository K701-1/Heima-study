package com.oop_API.stringdemo.string;

public class Test {
    public static void main(String[] args) {
        /*
         * String:
         *   1.直接赋值
         *   2.通过new赋值
         */

        String s = "abc";
        System.out.println(s);

        //new + 构造方法

        //无参构造方法
        String s1 = new String();
        System.out.println("--" + s1 + "--");

        //有参构造方法
        String s2 = new String(s);
        System.out.println(s2);

        //new + 有参构造（字符数组）
        char[] chs = {'a', 'b', 'c'};
        String s3 = new String(chs);
        System.out.println(s3);

        //new + 有参构造（字节数组）
        //ASCII码
        byte[] bytes = {97, 98, 99};
        String s4 = new String(bytes);
        System.out.println(s4);
    }
}
