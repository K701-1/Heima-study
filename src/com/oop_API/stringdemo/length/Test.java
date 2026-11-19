package com.oop_API.stringdemo.length;

public class Test {
    public static void main(String[] args) {
        // length():获取字符串的长度

        String s1 = "abcdefg";
        System.out.println(s1.length()); // 7

        String s2 = "";
        System.out.println(s2.length()); // 0 （空串长度为0）

        System.out.println("-------------------------------");

        //常配合 charAt 做遍历
        String str = "hello";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
