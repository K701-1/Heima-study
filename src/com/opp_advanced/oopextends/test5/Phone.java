package com.opp_advanced.oopextends.test5;

public class Phone extends SmartDevice {
    /*
        方法重写注意：
            1.如果父类中的代码不想用，此时可以在子类中重写完整代码
            2.如果父类中的代码基础上进行升级，此时可以通过super调用父类方法得到结果再进行操作
            3.被private\static\final修饰的方法不能被重写
     */
    @Override
    public double payment() {

        //调用父类方法计算价格
        double payment = super.payment();
        payment = payment * 0.9;
        return payment;
    }
}
