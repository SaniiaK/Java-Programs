package com.java.class36.apple.iphone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IphoneDriver {

    public static void main(String[] args) {
        // Use Scanner
        // use -> dynemic polymorphism
        // hint : you might have to tweak baseIphone, iphone7,8,10
        // do not change private access modifiers
        // Wrap your program in do while loop
        // default values all instance variables of iphone objects should be
        // batterylife =60;
        //Message text = "Welcome"
        //isLocked =false



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

        Scanner userInput = new Scanner(System.in);


        int again=0;
        do {
            System.out.println("Please choose an iphone model from these options: 7 = Iphone7, 8 = Iphone8, 10 = Iphone10 ");
            int model = userInput.nextInt();
           BaseIphone b;
           switch (model){
               case 7 :
                   b = new Iphone7(60,"Welcome", false);
                   break;
               case 8:
                   b = new Iphone8(60, "Welcome", false);
                   break;
               case 10:
                   b = new Iphone10(60, "Welcome", false);
                   break;
               default:
                   System.out.println("Please select from given options only");
                   b =null;
                   throw new InputMismatchException("Please enter numbers from 7,8,and 10");
           }



            System.out.println("Now please choose action that needs to be preformed");
            System.out.println("***Only one action at a time");
            System.out.println("1. Check BatteryLife\n" +
                    "2. Charge Iphone\n" +
                    "3. SendMessage\n" +
                    "4. ReadLastMessage\n" +
                    "5. check if iphone is locked\n" +
                    "6. lock iphone\n" +
                    "7. unlock iphone");


           int action = userInput.nextInt();

          switch (action){
              case 1:
                 b.getBatteryLevel();
                  break;
              case 2:
                  b.chargeBattery();
                  break;
              case 3:
                  System.out.println("Please enter your message: ");
                  String message = userInput.nextLine();
                  b.sendMessage(message);
                  break;
              case 4:
                  b.readMessage();
                  break;
              case 5:
                  b.isLocked();
                  break;
              case 6:
                  b.lock();
                  break;
              case 7:
                //  b.unlock();
                  break;
              default:
                  System.out.println("Please choose from above options only");
          }




            System.out.println("Enter 1 to run it again"+"\n"+ "or 2 to stop: ");
            again = userInput.nextInt();
        }while(again == 1);



    }
}
