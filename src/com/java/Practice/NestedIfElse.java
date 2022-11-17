package com.java.Practice;

import java.util.Scanner;

public class NestedIfElse {
    public static void main (String[] args){
///Suppose we are writing the code for an alarm clock, and the int variable "day" represents the current day with Mon=1, Tue=2, ... Sun=7.
 // On weekdays the clock tells us to get up, and weekends it tells us to snooze more. On Monday, the clock adds some extra harassment to get us out of bed.
 // The code uses an if-statement to distinguish weekends from weekdays, and inside the "weekday" case there is another if-statement for Mondays:

        Scanner sc = new Scanner(System.in);

        int mon =1, tue =2, wed= 3, thurs= 4, fri =5, sat=6, sun=7;
        int day;
        int weekday = 0;
        int weekend =0;

        System.out.println(" Enter day of the week 1-7: ");
        day = sc.nextInt();
         if (day <= 5){
             day = weekday;
             System.out.println(" Get up");
                if ( day == 1){
                 System.out.println("Hey hoooo, Hoooray time to got up");
             }


         }else {
             day = weekend;
             System.out.println("Snooze");
         }






//        if (day == 1) {
//            weekday = day;
//            System.out.println("Get up");
//               if (weekday == 1) {
//                   System.out.println("Hey dude! come on get up ");
//               }
//     }else if (day == 2){
//                   weekday = day;
//                   System.out.println("Get up 2");
//               } else if (day == 3) {
//                   weekday = day;
//                   System.out.println("Get up 3");
//
//               } else if (day == 4) {
//                   weekday = day;
//                   System.out.println("Get up 4");
//               }else if (day ==5){
//                   weekday = day;
//                   System.out.println("Get up 5");
//               }else if ( day == 6){
//            System.out.println("You can snooze more it's " + day);
//               } else if (day == 7 ) {
//            System.out.println("You can snooze more it's " + day);
//
//               }



        //System.out.println("");

    }

}
