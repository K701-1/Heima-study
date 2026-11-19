package com.oop_API.stringdemo.charAt;

public class Test {
    public static void main(String[] args) {
        /*
        charAt(int index) :
            是 String 的方法，作用是返回字符串中指定索引位置的那个字符（char）。
        */

        String str = "abcdefg";

        // 获取索引为0的字符
        char c1 = str.charAt(0);
        System.out.println(c1); // a

        // 获取索引为3的字符
        char c2 = str.charAt(3);
        System.out.println(c2); // d

        // 获取最后一个字符：索引 = length() - 1
        char last = str.charAt(str.length() - 1);
        System.out.println(last); // g
    }
}
