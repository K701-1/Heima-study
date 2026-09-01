package com.heima.controllerloop;

import java.util.Scanner;

public class BreakDemo2 {
    public static void main(String[] args) {
        /*
        需求：初始最大生命200，受X点伤害，技能恢复Y点，X和Y由键盘录入而来
        假设，游戏人物不会死亡，最低1点血
        问:最终游戏人物血量是多少?
        */

        int Hp = 200;
        int hurt = 0;

        Scanner sc = new Scanner(System.in);

        //循环+break解决负数问题
        while (true) {
            System.out.println("请输入当前人物收到的伤害：");
            hurt = sc.nextInt();

            //判断输入是否为正数
            if (hurt > 0) {
                break;
            } else {
                System.out.println("输入的伤害值必须为正数，请重新输入");
            }
        }


        Hp = Hp - hurt;

        if (Hp <= 0) {
            Hp = 1;
        }
        System.out.println("当前人物剩余血量：" + Hp);

        //循环+break解决负数问题
        int add = 0;
        while (true) {
            System.out.println("请输入技能恢复的血量：");
            add = sc.nextInt();

            //判断
            if (add > 0) {
                break;
            } else {
                System.out.println("输入的恢复值必须为正数，请重新输入");
            }
        }

        Hp = Hp + add;

        if (Hp > 200) {
            Hp = 200;
        }
        System.out.println("当前人物剩余血量：" + Hp);
    }
}
