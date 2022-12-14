package com.java.class36.apple.iphone;

public class Iphone8 extends BaseIphone {

    Iphone8(int batteryLevel, String messageText, boolean isLocked) {
        super(batteryLevel, messageText, isLocked);
    }

    public void unlock (){
        System.out.println("Unlocking using Touchid  FaceID");
    }

}
