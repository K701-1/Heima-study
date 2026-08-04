package com.heima.ifdemo;

import java.util.Scanner;

public class ifDemo6 {
    public static void main(String[] args) {
        /*需求:小明在每次订外卖都会在多家平台对比，看谁的优惠力度更大
            已知:
            美单App:全场9折优惠    饱了么App:满30减10元
            请问1:
            小明买了一顿烧烤50元，在哪家下单更划算
            请问2:
            如果价格不确定，数据由键盘录入而来呢?*/

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入价格：");
        double price = sc.nextDouble();

        double meidan = price * 0.9;
        System.out.println("美单打折后价格：" + meidan);

        double baoleme = 0;     //全局变量，全部生效
        if (price >= 0 && price < 30){
            baoleme = price;     //局部变量，只在大括号内生效
        }else if (price >= 30){
            baoleme = price - 10;
        }
        System.out.println("饱了么打折后价格：" + baoleme);

        if (meidan > baoleme){
            System.out.println("小明应该在饱了么下单");
        }else{
            System.out.println("小明应该在美单下单");
        }

    }
}
