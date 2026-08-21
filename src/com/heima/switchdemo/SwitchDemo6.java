package com.heima.switchdemo;

public class SwitchDemo6 {
    public static void main(String[] args) {
        //利用Switch模拟计算器

        int a = 10;
        int b = 20;
        String operator = "*";

        int result =switch (operator) {
            case "+" ->  a + b;
            case "-" ->  a - b;
            case "*" ->  a * b;
            case "/" ->  a / b;
            default -> 0;
        };
        System.out.println(result);
    }
}
