package com.heima.controllerloop;

public class BreakDemo1 {
    public static void main(String[] args) {
        //break:不能单独出现，只能写在 switch 或 循环 中，表示结束跳出

        //循环快速生成方式： 次数.fori+ 回车

        for (int i = 0; i < 100; i++) {
            if (i == 15) {
                break;
            }
            System.out.println(i);

        }
    }

}
