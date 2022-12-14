package com.java.class34;

public class TouchIDIphones extends BaseIPhone {

    public TouchIDIphones(String model, String color, String memoryInMG, String iOSVersion) {
        super(model, color, memoryInMG, iOSVersion);
    }


    String fingerPrintData []={"text1", "text2", "text3"};
    public boolean getUserTouchId (String fingerPrint){
        boolean isUnlock=false;
        for (int i=0; i<fingerPrintData.length; i++){
            if (fingerPrint.equals(fingerPrintData[i])){
                isUnlock=true;
            }
        }
        return isUnlock;
    }


}
