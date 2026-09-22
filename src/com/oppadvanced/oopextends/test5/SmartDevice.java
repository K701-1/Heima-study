package com.oppadvanced.oopextends.test5;

public class SmartDevice {
    String name;
    double price;

    public double payment() {
        //0-1000 不打折，1000-5000打9折，5000-10000打8折，10000以上打7折
        if (price >= 0 && price < 1000) {
            return price;
        } else if (price >= 1000 && price < 5000) {
            return price * 0.9;
        } else if (price >= 5000 && price < 10000) {
            return price * 0.8;
        }else if (price>10000){
            return price * 0.7;
        }else{
            System.out.println("输入价格有误");
            return 0;
        }
    }
}
