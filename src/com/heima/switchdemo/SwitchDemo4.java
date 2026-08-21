package com.heima.switchdemo;

import java.util.Scanner;

public class SwitchDemo4 {
    public static void main(String[] args) {
        /*

        case穿透应用场景（多个case执行语句一致）：
        1.多个case共享相同的代码块
        2.根据变量的值，执行多个case

        根据用户输入的月份，输出季节
        春季:3~5月
        夏季;6~8明
        秋季:9~11月
        冬季:12月、1月、2月

        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scanner.nextInt();

        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("输入的月份不存在");
        }
    }
}
