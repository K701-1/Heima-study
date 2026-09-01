package com.heima.loopdowhile;

public class DoWhileDemo {
    public static void main(String[] args) {

        //do while循环: 熟悉语法即可

        //do while特点 ： 先执行后判断，至少执行一次
        //for while特点： 先判断后执行，可能一次都不执行

        //打印5次hello world
        int i = 1;
        do {
            System.out.println("hello world");
            i++;
        }while (i <= 5);
    }
}
