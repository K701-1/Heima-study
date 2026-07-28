package com.heima.ifdemo;

public class IfDemo3 {
    public static void main(String[] args) {
        /*if的细节:
            1.1f语句大括号的位置
                左括号写在上一行的末尾，不要单独写一行

                K&R风格(紧凑风): 左括号在上一行的末尾（Java使用这种）
                Al1man风格(折叠风): 左括号另起一行

                K&R风格:
                    创造c语言的两位大神
                    布莱恩.克尼汉 Brian Kernighan
                    丹尼斯.里奇 DennisRitchie
                    《The C Programming Language》书里面两种风格都用到了
                    仿照大神的风格，从两个名字各取一个字母，左括号在上一行的末尾-->K&R风格
                        Java Go
                        Java:Oracle官方示例
                        谷歌编码规范
                        Spring框架 -->K&R风格

                Allman风格:
                    BSD UNIX操作系统的主要开发者艾瑞克·奥尔曼(Eric.Allman)
                    C# -->Allman风格


            2.If语句大括号的省略
                如果大括号中语句体 只有一行 ，大括号可以省略
            3.小括号后面不能有分号
                小括号后面不能有分号，这样会拆开if的语句结构
            4.判断布尔类型的变量
                判断布尔类型的变量，直接把变量写在小括号中即可*/

        double temp = 38.5;

//        if (temp >= 38){
//            System.out.println("请自我隔离");
//        }

//          if (temp >= 38)
//              System.out.println("请自我隔离");

        if (temp >= 38) System.out.println("请自我隔离");

    }
}
