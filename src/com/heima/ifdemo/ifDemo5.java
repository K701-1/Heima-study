package com.heima.ifdemo;

public class ifDemo5 {
    public static void main(String[] args) {
        // else  ,   else if
        //定义一个小数表示考试成绩，判断学生成绩，如果大于60输出通过，反之不通过

        double score = 61;

        //判断成绩合理
        if(score < 0 || score > 100){
            System.out.println("成绩不合理");
        } else {
            if(score >= 60){
                System.out.println("通过");
            }else{
                System.out.println("未通过");
            }
        }


    }
}
