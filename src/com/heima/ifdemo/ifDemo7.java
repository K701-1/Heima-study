package com.heima.ifdemo;

import java.util.Scanner;

public class ifDemo7 {
    public static void main(String[] args) {
        /*需求:很多App都有不同的优惠券
            假设，现在有以下优惠券
            全场商品满10减8
            全场商品满50减30
            全场商品满100减50
            全场商品满200减90

            会员卡:全场8折
            请问:会员卡和优惠券不能同时使用，最优惠的价格是多少?*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入价格：");
        double price = sc.nextDouble();

        double discount = 0;

        if(price > 0){
            if (price < 10) {
                discount = price;
            } else if (price < 50) {
                discount = price - 8;
            } else if (price < 100) {
                discount = price - 30;
            } else if (price < 200) {
                discount = price - 50;
            }else {
                discount = price - 90;
            }
        }else {
            System.out.println("输入价格有误");
        }

        double vipprice = price * 0.8;

        System.out.println("使用优惠券后价格：" + discount + "元");
        System.out.println("会员优惠后价格：" + vipprice + "元");

        if (vipprice < discount){
            System.out.println("使用会员更优惠");
        }else if (vipprice > discount){
            System.out.println("使用优惠券更优惠");
        }else {
            System.out.println("使用会员和优惠券一样优惠");
        }

    }
}
