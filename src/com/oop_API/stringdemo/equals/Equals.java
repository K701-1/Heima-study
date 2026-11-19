package com.oop_API.stringdemo.equals;

public class Equals {
    public static void main(String[] args) {
        //equals:比较两个字符串的内容是否相等（大小写敏感）

        String s = "abc";
        String s2 = "ABC";
        String s3 = "abc";

        System.out.println(s.equals(s3));   // true
        System.out.println(s.equals(s2));   // false  （大小写不同）

        System.out.println("-----------------------------------");

        //重点：比较字符串内容必须用 equals，不要用 ==。== 比较的是内存地址（是不是同一个对象），不是内容。
        String a = new String("abc");
        String b = new String("abc");
        System.out.println(a == b);        // false  （两个不同对象，地址不同）
        System.out.println(a.equals(b));   // true   （内容相同）
    }
}
