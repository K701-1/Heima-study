package com.heima.method;

public class MethodDemo4 {

    //定义方法打印九九乘法表

    public static void main(String[] args) {
        printMultiTable();
    }

    //定义方法打印
    //没有参数的方法，形参空着，调用时实参也是空的
    public static void printMultiTable(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
