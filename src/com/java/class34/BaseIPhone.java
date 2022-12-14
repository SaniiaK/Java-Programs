package com.java.class34;

public class BaseIPhone {
// Whenever you are creating Iphone ask the user to input
// model, color, iOSVersion in the constructor
// when  creating concrete Iphone like Iphone7 and Iphone 8 etc.
// you should ask the user to enter

    private String model;
    private String color;
    private String memoryInMG;
    private String iOSVersion;

    private String messages;
    private String notes;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getiOSVersion() {
        return iOSVersion;
    }

    public void setiOSVersion(String iOSVersion) {
        this.iOSVersion = iOSVersion;
    }

    public BaseIPhone(String model, String color, String memoryInMG, String iOSVersion) {
        this.model = model;
        this.color = color;
        this.memoryInMG = memoryInMG;
        this.iOSVersion = iOSVersion;
    }
    public String toString (){
        return "BaseIphone ";
    }

    public String writeAMessage (String messages){
        return messages;
    }

    public String writeANote (String notes){
        return notes;
    }



}
