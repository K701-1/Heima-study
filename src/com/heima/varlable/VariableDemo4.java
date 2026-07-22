package com.heima.varlable;

public class VariableDemo4 {

    public static void main(String[] args) {
        /*
        定义8种数据类型的变量:
        整数类型:byte、short、int、long浮点数类型:float、double
        字符类型:char
        布尔类型:boolean
        */

        //变量定义格式： 数据类型 变量名 = 数据值

        //1.byte类型
        byte b = 10;
        System.out.println(b);

        //2.short
        short s = 23784;
        System.out.println(s);

        //3.int
        int i = 1234567890;
        System.out.println(i);

        //4.long
        //结尾需要L结尾，建议大写方便阅读
        long l = 123456789012345L;
        System.out.println(l);

        //5.浮点数类型：float double
        //float类型需要结尾需要f或F结尾，建议大写方便阅读
        float f = 123.45F;
        System.out.println(f);

        double d = 123.45;
        System.out.println(d);

        //6.字符类型：char
        char c = '中';
        System.out.println(c);

        //7.布尔类型：boolean
        boolean bool = true;
        System.out.println(bool);
    }

}
