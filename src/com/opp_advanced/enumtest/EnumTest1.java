package com.opp_advanced.enumtest;

public class EnumTest1 {
    /*
        定义一个JavaBean类，描述电商项目中，订单状态的表示：
            1.待处理   -> PAYMENT_PENDING
            2.处理中   -> PROCESSING
            3.已发货   -> SHIPPED
            4.配送中   -> OUT_FOR_DELIVERY
            5.已送达   -> DELIVERED
            6.已取消   -> CANCELLED
    */
    public static void main(String[] args) {
       // OrderState PAYMENT_PENDING = new OrderState("待支付");

        //获取枚举类对象
        OrderState o1 = OrderState.PAYMENT_PENDING;
        System.out.println(o1.getName());

        //匹配
        switch (o1){
            case PAYMENT_PENDING -> System.out.println("待支付");
            case PROCESSING -> System.out.println("处理中");
            case SHIPPED -> System.out.println("已发货");
            case OUT_FOR_DELIVERY -> System.out.println("配送中");
            case DELIVERED -> System.out.println("已送达");
            case CANCELLED -> System.out.println("已取消");
        }
    }
}
