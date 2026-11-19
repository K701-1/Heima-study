package com.oop_API.stringdemo.replce;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        * replace(旧值，新值) :替换
        * 替换字符串中所有的 oldChar 为 newChar
        *
        * 需求：敏感词替换
        */

        String str = "你玩的好菜啊，TMD";

        //替换
        String newStr = str.replace("TMD", "****");
        System.out.println(newStr);


        //1.定义一个敏感词库
        String[] arr = {"TMD", "SB", "Bitch","LJ","Fuck"};

        //2.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String msg = sc.next();

        //3.遍历敏感词库，替换敏感词
        for (int i = 0; i < arr.length; i++) {
            msg = msg.replace(arr[i], "****");
        }
        System.out.println(msg);

    }
}
