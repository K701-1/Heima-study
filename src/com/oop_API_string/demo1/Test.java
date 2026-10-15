package com.oop_API_string.demo1;

//定位 Random 位置
import java.util.Random;

public class Test {
    //查询API帮助文档，使用 Random类 获取随机小数的方法

    public static void main(String[] args) {
        Random r = new Random();

        //nextDouble() 获取随机小数 【0.0-1.0)
        double num1 = r.nextDouble();
        System.out.println(num1);

        double num2 = r.nextDouble(5);//获取随机小数 【0.0-5.0)
        System.out.println(num2);

        System.out.println("--------------------------------");

        for (int i = 0; i < 5; i++) {
            double num3 = r.nextDouble(5, 9);//获取随机小数 【5.0-9.0)
            System.out.println(num3);
        }

    }

}
