package com.oop_advanced.oop_interface.test4;

public class Test {
    public static void main(String[] args) {
        PingPangSpoter pps = new PingPangSpoter("许昕", 37);
        System.out.println(pps.getName() + " " + pps.getAge());
        pps.study();
        pps.speakEnglish();
    }
}
