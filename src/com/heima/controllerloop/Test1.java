package com.heima.controllerloop;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //生成1-100的随机数，利用键盘录入模拟猜，一直猜，直到猜中

        Random r = new Random();
        //   1.()空着在int范围内随机取
        //   2.()中填数字n，在0-数字n之间随机取，不包含n   （更常用）
        //   3.()中填两个数字m,n，在m-n之间随机取，包含m，不包含n
        int num =r.nextInt(1,101);

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的猜测：");
            int guessNum = sc.nextInt();

            if(guessNum > num) System.out.println("猜大了");
            else if (guessNum < num) System.out.println("猜小了");
            else if (guessNum == num) {
                System.out.println("猜对了");
                break;
            }
        }


    }
}
