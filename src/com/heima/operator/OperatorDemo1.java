package com.heima.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {

        //算数运算符：+ - * / %

        //整数计算
        //整数相除商还是整数
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println("--------------------------------------");

        //小数计算
        //小数直接参与运算，结果可能是不准确的
        double c = 10.0;
        double d = 3.0;

        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c % d);
    }
}
