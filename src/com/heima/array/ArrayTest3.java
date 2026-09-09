package com.heima.array;

public class ArrayTest3 {
    public static void main(String[] args) {

        //ArrayTest4前置练习：交换两个变量中的数据

        int a = 10;
        int b = 20;

        //定义第三方变量，用来交换变量
        int temp = a;

        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}
