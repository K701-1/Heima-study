package com.heima.varlable;

import java.util.Scanner;

public class VariableDemo8 {
    public static void main(String[] args) {

        //BMI = weight / (height * height)

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的体重：");
        int weight = sc.nextInt();

        System.out.println("请输入您的身高：");
        double height = sc.nextDouble();

        double BMI = weight / (height * height);
        System.out.println("您的BMI指数是：" + BMI);
    }
}
