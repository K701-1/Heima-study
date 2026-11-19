package com.oop_API.stringdemo.equals;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        //equalsIgnoreCase:比较两个字符串的内容是否相等（大小写不敏感）

        //典型场景：比如登录时忽略验证码大小写

        String s1 = "abc";
        String s2 = "ABC";

        System.out.println(s1.equalsIgnoreCase(s2)); // true  （忽略大小写，视为相等）
    }
}
