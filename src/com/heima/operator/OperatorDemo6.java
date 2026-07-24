package com.heima.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {

        //实现字母大小写转换，将大写转化为小写
        // ASCLL码

        //1.定义变量记录大写
        char big = 'A'; //65

        //2.转成小写
        char small = (char)(big + 32);  //65 + 32 = 97

        System.out.println(small);
    }
}
