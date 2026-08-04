package com.heima.ifdemo;

import java.util.Scanner;

public class ifDemo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入体重（kg）：");
        double weight = sc.nextDouble();
        System.out.println("请输入身高(m)：");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("你的身高为：" + height);
        System.out.println("你的体重为：" + weight);
        System.out.println("你的BMI指数为：" + bmi);

        if (bmi < 18.5){
            System.out.println("消瘦，健康风险部分增加");
        } else if (bmi <= 23.9) {
            System.out.println("正常，健康风险正常");
        } else if (bmi <= 26.9) {
            System.out.println("过重，健康风险增加");
        } else if (bmi <= 29.9) {
            System.out.println("肥胖，健康风险中度增加");
        } else{
            System.out.println("严重肥胖，健康风险严重增加");
        }
    }
}
