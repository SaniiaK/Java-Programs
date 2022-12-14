package com.java.class34;

import com.java.Practice.Arrays;

public class TestApple {
    public static void main(String[] args) {
       TouchIDIphones iphone = new TouchIDIphones("IPhone7", "black", "512", "7");


        Iphone7 iphone7 = new Iphone7("IPhone7", "black", "512", "7");
        Iphone8 iphone8 = new Iphone8("Iphone8", "grey", "512", "8");




        BaseIPhone deviceid1 = new Iphone7("Iphone7", "grey", "512", "16");
        BaseIPhone deviceid2 = new Iphone7("Iphone7", "grey", "512", "14");
        BaseIPhone deviceid3 = new Iphone7("Iphone7", "grey", "512", "15");
        BaseIPhone deviceid4 = new Iphone7("Iphone7", "grey", "512", "15");
        BaseIPhone deviceid5 = new Iphone7("Iphone7", "grey", "512", "15");
     System.out.println(deviceid5);



        TouchIDIphones ti = new Iphone7("Iphone7", "grey", "512", "8");
        BaseIPhone [] allIphones = new BaseIPhone[4];
        allIphones [0] = deviceid1;
        allIphones [1] = deviceid2;
        allIphones [2] = deviceid3;
        allIphones [3] = deviceid4;
        allIphones [4] = deviceid5;



        System.out.println(whichIphone(ti));

        int [] deviceId = new int [4];
        String [] modelIds = new String[4];
        int [] memories = new int [4];
        String [] colors = new String[4];
        String [] iOSversion = new String[4];

//        updateIOS(allIphones);
        System.out.println(Arrays.toString );
    }
public static String whichIphone (BaseIPhone baseiphone){


       return baseiphone.getModel();
}
 //create a static method that takes an array of all types of Iphones and finds all iphones
 //with an IOSversion that is not 16.0 and updates them to 16.0
//public static void updateIOS (BaseIPhone[]baseIPhones){
//     for (baseIPhones[]: baseIPhones){
//      if (!baseIPhones[i].getiOSVersion().equals(16)){
//       baseIPhones[i].setiOSVersion("16");
//      }
//
//
//     }

}
//BaseIphone deviceId2 = new BaseIphone("Iphone8", 256, "Silver", "14.0");
//        BaseIphone deviceId3 = new BaseIphone("Iphone10", 156, "matte", "15.0");
//        BaseIphone deviceId4 = new BaseIphone("Iphone8", 156, "Matte", "15.0");

//}


// write