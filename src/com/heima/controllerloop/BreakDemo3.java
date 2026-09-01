package com.heima.controllerloop;

import java.util.Scanner;

public class BreakDemo3 {
    public static void main(String[] args) {

        //键盘录入一个数判断是否为质数

        //质数：只能被1和它本身整除的数

        Scanner sc = new Scanner(System.in);
        int num = 0;

        while (true){
            System.out.println("请输入一个大于2的整数：");
            num = sc.nextInt();
            if (num > 2){
                break;
            }else{
                System.out.println("输入的数不大于2，请重新输入");
            }
        }

        int count = 0;
        for (int i = 2; i < num - 1 ; i++) {    //结束条件可以使用 Math.sqrt(num)
            if(num % i == 0){
                //只要找到一个数字能被num整除，那么num就不是质数，count == 0证明没有能被整除
                count++;
//                System.out.println(num + "不是质数");
                break;
            }   //else写在这里会导致出现两个结果
        }

        if(count == 0){
            System.out.println(num + "是质数");
        }else{
            System.out.println(num + "不是质数");
        }

    }
}
