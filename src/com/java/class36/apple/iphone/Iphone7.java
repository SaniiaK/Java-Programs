package com.java.class36.apple.iphone;

import com.java.class36.apple.iphone.BaseIphone;

public class Iphone7 extends BaseIphone {

    Iphone7(int batteryLevel, String messageText, boolean isLocked) {
        super(batteryLevel, messageText, isLocked);
    }

    public void unlock (){
        System.out.println("Unlocking using TouchId");
    }

}

