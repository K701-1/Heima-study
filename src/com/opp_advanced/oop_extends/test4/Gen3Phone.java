package com.opp_advanced.oop_extends.test4;

public class Gen3Phone extends Gen2Phone {
    //方法重写
    @Override   //注解
    public void call() {
        System.out.print("开启视频");
        System.out.println("打电话");
    }

    public void playGame() {
        System.out.println("玩游戏");
    }
}
