package com.heima.varlable;

public class VariableDemo3 {
    /*
     变量的注意事项:
     1.只能存一个值
     2.变量名不允许重复定义
     3.变量在使用之前一定要进行赋值
     4.一条语句可以定义多个变量，也可以连续赋值
     */
    public static void main(String[] args) {

        // 1. 变量在使用之前一定要进行赋值
        int a;
        a = 10;
        System.out.println(a);

        //一条语句可以定义多个变量，也可以连续赋值
        int b,c,d;

//        b = 10;
//        c = 20;
//        d = 30;

        b = c = d = 10;

        System.out.println(b + c + d);

    }
}
