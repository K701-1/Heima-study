package com.heima.loopwhile;

public class WhileDemo3 {
    public static void main(String[] args) {
        //一张0.1毫米的纸折叠多少次能超过8848.86米

        double paper = 0.1;
        double mountHeight = 8848860;

        int count = 0;
        while(paper < mountHeight){
            paper = paper *2;
            count++;
        }
        System.out.println("需要" + count + "次");
    }
}
