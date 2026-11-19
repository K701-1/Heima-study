package com.oop_API.stringdemo.subString;

public class Test2 {
    public static void main(String[] args) {
        //需求：只保留用户名的第一个字符，后面三个用 *** 替代

        /*
        分析：
            1.charAt(0)
            2.substring(0,1)
        */


        String name = "zhangsan";

        //charAt
        char firstname1 = name.charAt(0);
        String encryption1 = firstname1 + "***";
        System.out.println(encryption1);

        //substring
        String firstname2 = name.substring(0, 1);
        String encryption2 = firstname2 + "***";
        System.out.println(encryption2);
    }
}
