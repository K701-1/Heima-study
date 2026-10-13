package com.oop_advanced.oop_interface.test4;

public class PingPangSpoter extends Sporter implements English{
    public PingPangSpoter() {
    }

    public PingPangSpoter(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学习打乒乓球");
    }
}
