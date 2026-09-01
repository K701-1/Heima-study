package com.heima.loopwhile;

public class WhileDemo1 {
    public static void main(String[] args) {
        /*
        初始化语句
        while(条件判断语句){
            循环体语句
            条件控制语句
        }
        */

        //利用while循环，实现游戏中10次跳跃，使用输出语句模拟
        int i = 1;
        while (i <= 10) {
            System.out.println("跳跃一次");
            i++;
        }
    }
}
