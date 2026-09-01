package com.heima.controllerloop;

public class ContinueDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if(i==3) continue;  //到3时，直接跳转下一次循环

            System.out.println(i);
        }
    }
}
