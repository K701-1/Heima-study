package com.opp_advanced.oop_extends.test5;

public class Test {
    /*
        智能设备包括：手机、平板、电脑
        1.所有智能设备包括属性：商品名、价格
          行为：计算商品总价格：0-1000 不打折，1000-5000打9折，5000-10000打8折，10000以上打7折
        2.手机享受额外补贴，再打九折

    */
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.name = "Xiaomi 1";
        phone.price = 1999;

        double payment = phone.payment();
        System.out.println("商品名：" + phone.name + "，价格：" + payment);

        System.out.println("-------------------------------------------------");

        Pad pad = new Pad();
        pad.name = "XiaomiPad 1";
        pad.price = 6999;

        double paymentPad = pad.payment();
        System.out.println("商品名：" + pad.name + "，价格：" + paymentPad);

        System.out.println("-------------------------------------------------");

        Computer computer = new Computer();
        computer.name = "Xiaomi Computer 1";
        computer.price = 10999;

        double paymentComputer = computer.payment();
        System.out.println("商品名：" + computer.name + "，价格：" + paymentComputer);
    }
}
