package com.heima.loopfor;

public class ForDemo4 {
    public static void main(String[] args) {
        //求 1-100之间的偶数和

        int sum = 0;

        for(int i = 1;i <=100;i++){
            if (i % 2 ==0){
                sum += i;
            }
        }

        /*for (int i = 2;i <=100;i +=2){
            sum += i;
        }*/

        System.out.println("1-100之间的偶数和为" + sum);
    }
}
