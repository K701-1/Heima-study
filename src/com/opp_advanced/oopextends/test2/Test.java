package com.opp_advanced.oopextends.test2;

public class Test {
    public static void main(String[] args) {
        Android a = new Android();
        a.brand = "Xiaomi";
        a.price = 1999;

        System.out.println(a.brand + " " + a.price);

        a.nfc();
        a.call();
        a.sendMessage();

        System.out.println("----------");

        Apple i = new Apple();
        i.brand = "Apple";
        i.price = 7999;

        System.out.println(i.brand + " " + i.price);

        i.call();
        i.sendMessage();

        System.out.println("----------");

        Computer c = new Computer();
        c.brand = "ROG";
        c.price = 10999;

        System.out.println(c.brand + " " + c.price);

        c.coding();

    }
}
