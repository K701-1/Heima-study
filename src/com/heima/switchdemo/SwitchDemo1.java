package com.heima.switchdemo;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        //switch 首先计算表达式的值。
        // 依次和case后面的值进行比较，如果有对应的值，就会执行相应的语句，在执行的过程中，遇到break就会结束。
        // 如果所有的case后面的值和表达式的值都不匹配，就会执行default里面的语句体，然后结束整个switch语句。

        /*
        switch的注意点:
        1.表达式:结果(字符/整数byte short int/枚举/字符串) ---不支持小数和整数long
        2.case:被匹配的值，只能是真实的数据 ---不能写变量
        3.case:值不允许重复
        4.break:表示中断，结束的意思，结束switch语句
        5.default:所有情况都不匹配，执行该处的内容
        */


        /*
        需求:键盘录入星期数，显示今天的减肥活动。
        周一:跑步
        周二:游泳
        周三;慢走
        周四:动感单车
        周五:拳击
        周六，爬山
        周日:好好吃一顿
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int week = scanner.nextInt();

        switch (week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("输入的星期数不合法");
        }
    }

}
