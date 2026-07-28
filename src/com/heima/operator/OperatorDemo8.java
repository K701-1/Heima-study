package com.heima.operator;

public class OperatorDemo8 {
    public static void main(String[] args) {

    /*

    =     直接运算
    +=    加后赋值
    -=    减后赋值
    *=    乘后赋值
    /=    除后赋值
    %=    取模后赋值

    */
        int a = 10;
        int b = 20;

        a += b;

        System.out.println(a);  //30
        System.out.println(b);  //20

        int c = 10;
        int d = 21;

        d %= c;
        System.out.println(c);  //10
        System.out.println(d);  //1
    }


}
