package com.heima.controllerloop;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //小保底：只要3次没猜中，提示猜测范围
        //大保底：只要10次没猜中，直接猜中了

        Random r = new Random();
        int num =r.nextInt(1,101);

        //定义两个计数器
        int countA = 0; //小保底
        int countB = 0; //大保底

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的猜测：");
            int guessNum = sc.nextInt();

            //计数器自增
            countA++;
            countB++;

            //大保底机制
            if(countB==10){
                guessNum = num;
            }

            //比较
            if(guessNum > num) System.out.println("猜大了");
            else if (guessNum < num) System.out.println("猜小了");
            else if (guessNum == num) {
                System.out.println("猜对了");
                break;
            }

            //每三次没猜中触发小保底
            if(countA%3==0){
                System.out.println("小保底触发，随机数字范围"+(num-5)+"~"+(num+5));
            }
        }


    }
}