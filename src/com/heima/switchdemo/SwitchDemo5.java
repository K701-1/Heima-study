package com.heima.switchdemo;

public class SwitchDemo5 {
    public static void main(String[] args) {
        /*

        新特性(jdk 14及以上)：
        一、箭头标签（不会发生case穿透）
        二、case后面可以写多个值

        三、switch可以有运行结果
        四、yield关键字          （使用week的值匹配case赋值给name）

        */

        int week = 6;
        int week2 = 4;

        switch (week) {
            case 1 -> {
                System.out.println("跑步");
            }
            case 2 -> System.out.println("游泳");

            case 3,4,5 -> System.out.println("慢走");
        }

        String name = switch (week2) {
            default -> {
                yield "其他";
            }
            case 1 -> "一";  //如果只有一行，大括号{}、yield关键字可以省略
        };
        System.out.println(name);
    }
}
