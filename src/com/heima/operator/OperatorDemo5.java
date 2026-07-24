package com.heima.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        //练习一:
        byte b = 100;
        short s = 200;
        double d = 20.3;

        //请说出下面代码在计算的时候，类型转换的情况
        double resultl = b + s + d;
        System.out.println(resultl);    //320.3

        /*
         b -> int -> double
         s -> int -> double
        */

        //练习二:
        /*
        检查下面代码，程序运行的时候是否会报错，如果会，请说明错误原因*/
        short s1 = 100;
        short s2 = 200;
        // byte result2 = s1 + s2;
        // System.out.println(result2);

        //方案一：强制转换为byte，计算结果会出现问题
        byte result1 = (byte)(s1 + s2);
        System.out.println(result1);

        //方案二：强制转换为int，计算结果不会出现错误
        int result2 = s1 + s2;
        System.out.println(result2);

    }
}
