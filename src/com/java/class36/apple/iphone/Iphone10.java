package com.java.class36.apple.iphone;

public class Iphone10 extends BaseIphone {


    Iphone10(int batteryLevel, String messageText, boolean isLocked) {
        super(batteryLevel, messageText, isLocked);
    }

    public void unlock (){
         System.out.println("Unlocking using FaceID");
     }


}
