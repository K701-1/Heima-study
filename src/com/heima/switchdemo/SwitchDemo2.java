package com.heima.switchdemo;

public class SwitchDemo2 {
    public static void main(String[] args) {
        /*

        1.default的位置和省略
        位置：case 和 default 的位置没有上下顺序要求
            为了阅读性，通常会将default写在最后，case从小到大

        省略：default 可以省略，若此时没有任何case匹配，将不会输出；但是一个switch语句中最多只能出现一个default
        */

        int week = 3;

        switch (week) {
            case 3:
                System.out.println("跑步");
                break;
            default:
                System.out.println("其他");
                break;
            case 1:
                System.out.println("游泳");
                break;
            case 2:
                System.out.println("慢走");

        }

    }
}
