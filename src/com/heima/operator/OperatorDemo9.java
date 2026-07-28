package com.heima.operator;

import java.util.Scanner;

public class OperatorDemo9 {
    public static void main(String[] args) {
        //练习一：输入两人身高，判断谁更高

        //1.键盘录入两个小数，分别表示两个人身高
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入我的身高：");
        double myHeight = sc.nextDouble();

        System.out.println("请输入你兄弟的身高：");
        double broHeight = sc.nextDouble();

        //2.比较两个身高，并输出结果
        boolean result = myHeight >= broHeight;
        System.out.println(result);
    }
}
