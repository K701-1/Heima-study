package com.heima.ifdemo;

public class IfDemo1 {
    public static void main(String[] args) {
        //定义一个变量表示人的体温，对体温进行判断是否大于等于38，如果超过打印语音警告

        double temp = 38.5;

        if (temp >= 38){
            System.out.println("请自我隔离");
        }
    }
}
