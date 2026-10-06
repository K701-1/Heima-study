package com.opp_advanced.enumtest;

public enum OrderState {

    //在枚举类第一行，把所有对象罗列出来
    PAYMENT_PENDING("待支付"),
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    OUT_FOR_DELIVERY("配送中"),
    DELIVERED("已送达"),
    CANCELLED("已取消");


    private String name;

    //枚举类的构造方法默认使用private，就算不写，编译器也会默认添加
    private OrderState() {
    }

    private OrderState(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
