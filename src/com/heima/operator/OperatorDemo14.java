package com.heima.operator;

public class OperatorDemo14 {
    public static void main(String[] args) {

        //2.寻找7的有缘数，定义一个两位整数，只要该数字包含7或者是7的倍数，则该数字为有缘数

        int num = 34;

        int ge = num % 10;
        int shi = num / 10 % 10;

        boolean result = ge == 7 || shi == 7 || num % 7 == 0;
        System.out.println(result);
    }
}
