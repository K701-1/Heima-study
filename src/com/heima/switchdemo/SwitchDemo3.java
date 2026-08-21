package com.heima.switchdemo;

public class SwitchDemo3 {
    public static void main(String[] args) {
        /*2.case穿透：当没有break停止时，程序会依次执行后续的case，直到遇到break为止*/


        int week = 3;

        switch (week) {
            case 1:
                System.out.println("跑步");
            case 2:
                System.out.println("游泳");
            case 3:
                System.out.println("慢走");
            default:
                System.out.println("其他");
        }
    }
}
