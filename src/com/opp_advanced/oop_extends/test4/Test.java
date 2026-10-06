package com.opp_advanced.oop_extends.test4;

public class Test {
    /*
    方法重写

        第一代手机：打电话
        第二代手机：打电话、发短信
        第三代手机：打视频电话（升级）、发短信、玩游戏
    */
    public static void main(String[] args) {
        Gen1Phone p1 = new Gen1Phone();
        p1.call();

        System.out.println("------------");

        Gen2Phone p2 = new Gen2Phone();
        p2.call();
        p2.sendMS();

        System.out.println("------------");

        Gen3Phone p3 = new Gen3Phone();
        p3.call();
        p3.sendMS();
        p3.playGame();
    }
}
