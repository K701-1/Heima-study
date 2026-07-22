package com.heima.varlable;

public class VariableDemo5 {
    public static void main(String[] args) {

        //BMI = 体重 / 身高的平方

        double Weight = 75;
        double Hight = 1.68;

        double BMI = Weight / (Hight * Hight);

        System.out.println(BMI);

        //扩展：计算当前身高在标准BMI：18.5 -23.9 最高是多少千克
        double maxWeight = 23.9 * Hight * Hight;
        System.out.println("标准BMI下最高体重为：" + maxWeight);

    }
}
