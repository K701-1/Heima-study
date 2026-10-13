package com.opp_advanced.oop_interface.test4;

public class PingPangCoach extends Coach implements English {

    @Override
    public void teach() {
        System.out.println("教练正在教乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("教练正在说英语");
    }
}
