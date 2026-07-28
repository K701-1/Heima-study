package com.heima.ifdemo;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        /*假设，游戏人物不会死亡，最少1点血
        需求:初始最大生命200，受到x点伤害，技能恢复Y点血，x和Y由键盘录入而来
        问:最终游戏人物血量是多少?*/

        int Hp = 200;

        System.out.println("请输入当前人物收到的伤害：");
        Scanner sc = new Scanner(System.in);
        int hurt = sc.nextInt();    //判断输入是否为正数

        Hp = Hp - hurt;

        if (Hp <= 0){
            Hp = 1;
        }
        System.out.println("当前人物剩余血量：" + Hp);

        System.out.println("请输入技能恢复的血量：");
        int add = sc.nextInt();

        Hp = Hp + add;

        if (Hp > 200){
            Hp = 200;
        }
        System.out.println("当前人物剩余血量：" + Hp);
    }
}
