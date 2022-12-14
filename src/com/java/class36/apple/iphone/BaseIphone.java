package com.java.class36.apple.iphone;

import com.java.class36.apple.Charger;
import com.java.class36.apple.Locker;
import com.java.class36.apple.Messenger;



//Use Scanner
//use -> dynamic polymorphism
//hint: you might have to tweak baseIphone, iphone7,8,10 classes.
//WRAP your program in a while loop => so that I can check battery, then chargeBattery then checkBattery again
// -> until Im done using the program

// do not change private access modifiers
//the default values of instance variables of Iphone Objects should be
//batterylife=60;
//MessageText="Welcome"
//isLocked=false;


//write an app that asks the user to pick Iphone
//once the user picks an iphone
//ask them what action they want to perform
//options are:
//1. Check BatteryLife
//2. Charge Iphone
//3. SendMessage
//4. ReadLastMessage
//5. check if iphone is locked
//6. lock iphone
//7. unlock iphone

public abstract class BaseIphone implements Charger, Locker, Messenger {


    private int batteryLevel;
    private String messageText;
    private boolean isLocked;
    private String lastMessage;



     BaseIphone (int batteryLevel, String messageText, boolean isLocked){
         this.batteryLevel = batteryLevel;
         this.messageText =messageText;
         this.isLocked = isLocked;

    }
    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText, String lastMessage ) {

         this.messageText = messageText;
         this.lastMessage =lastMessage;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }





    @Override
    public void lock() {
        System.out.println("Locked");

    }

    @Override
    public void chargeBattery() {
        batteryLevel++;

    }

    @Override
    public void sendMessage(String text) {
        lastMessage = text;

    }

    @Override
    public void readMessage() {
        System.out.println(lastMessage);

    }


}
