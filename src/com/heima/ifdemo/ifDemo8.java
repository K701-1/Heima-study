package com.heima.ifdemo;

import java.util.Scanner;

public class ifDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入充值的金额：");
        double money = sc.nextDouble();

        if (money >0){
            if(money < 1000){
                System.out.println("恭喜你，充值成功！当前余额：" + money);
            } else if (money < 2000) {
                money = money + 200;
                System.out.println("恭喜你，充值成功！当前余额：" + money);
            } else if (money < 3000) {
                money = money + 500;
                System.out.println("恭喜你，充值成功！当前余额：" + money);
            } else if (money < 5000) {
                money = money + 700;
                System.out.println("恭喜你，充值成功！当前余额：" + money);
            }else if (money < 10000) {
                money = money + 1300;
                System.out.println("恭喜你，充值成功！当前余额：" + money);
            } else if (money < 20000){
                money = money + 2500;
                System.out.println("恭喜你，充值成功！当前余额：" + money);
            } else if (money < 50000) {
                money = money + 6000;
                System.out.println("恭喜你，充值成功！当前余额：" + money);
            }else {
                money = money + 15000;
                System.out.println("恭喜你，充值成功！当前余额：" + money);
            }
        }else {
            System.out.println("请输入正确的金额");
        }

    }
}
