package com.oop_API.stringdemo.subString;

public class Test1 {
    public static void main(String[] args) {
        /*
        * substring截取字符串
        * substring(int beginIndex, int endIndex) 截取 beginIndex 到 endIndex 之间的字符串
        * substring(int beginIndex) 截取 beginIndex 到字符串末尾的字符串
        * */

        String str = "abcdefg";

        //截取（包左不包右） [1,5)
        String subStr = str.substring(1,5);

        System.out.println(subStr);//bcde

        String subStr2 = str.substring(1);
        System.out.println(subStr2);//bcdefg

    }
}
