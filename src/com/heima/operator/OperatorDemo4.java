package com.heima.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {

        //数据类型不一样不能运算，需要转化成同类型的才能计算

        /*
        隐式转换：小转大，自动转换
        byte -> short （-> char） -> int -> long -> float -> double

        如有byte 或 short类型数据，先提升为int类型
        */

        byte a = 10;
        byte b = 20;

        int c = a + b;  //byte + byte -> int

        /*
        强制转换：大转小，需要手动转换，去掉不要的

        格式：目标数据类型 变量名 = (目标数据类型) 变量名
        */
        int x = 10;
        byte d = (byte) x;

        byte e = 10;
        byte f = 20;
        byte g = (byte) (e + f);    //注意 a + b 的括号

    }
}
