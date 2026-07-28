package com.heima.operator;

import java.util.Scanner;

public class OperatorDemo11 {
    public static void main(String[] args) {

        //逻辑运算符：&（与，同时满足）、|（或，二选一）、!（非，取反）
        //短路逻辑运算符（效率更高）：&&（短路与，左边为false，右侧不执行）、||（或，左侧为true，右侧不执行）
        //应用场景：登录界面 用户名密码比较验证（&&） 扫码、账号登录二选一（||）

        //练习一：键盘录入一个整数，判断数字是否在1-10之间

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        boolean result = (num >= 1 && num <= 10);
        System.out.println(result);
    }
}
