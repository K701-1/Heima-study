package com.heima.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {

        /*
        描述:
        给定秒数seconds，将其转换为对应的小时数、分钟数和秒数，使得总时间不变，但分钟数和秒数都不超过59.
        输入描述:
        在一行中输入一个整数seconds，表示要转换的秒数，满足(0 ≤ seconds ≤ 10的八次方)。
        输出描述:
        一行，包含三个整数，依次为输入整数对应的小时数、分钟数和秒数(可能为零)，中间用一个空格隔开。

        示例:
        输入:3661
        输出:1 1 1
        */

        //1.定义变量记录秒数
        int seconds = 5677;

        //2.计算小时数
        int hours = seconds / 3600;     // 3661 / 3600 = 1...61
        System.out.println(hours);

        //3.计算分钟数
        int minutes = seconds % 3600 / 60;
        System.out.println(minutes);

        //4.计算剩余的秒数
        int sec = seconds % 60;
        System.out.println(sec);
    }
}
