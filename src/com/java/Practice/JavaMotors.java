package com.java.Practice;

import java.util.Scanner;

public class JavaMotors {
    public static void main(String[] args) {
        /**
         * Java Motors Inc. is recalling all vehicles from model years 2001-2002, 2004-2006 and 2015-2017.
         * Write a program that will find vehicle for recall.
         *
         * example output:
         * out: Enter vehicle's year:
         * in: 2001
         * out: Your vehicle needs to be recalled!
         *
         *  if the value of modelYear does fall within the four recall ranges
         *  out: Your vehicle is fine, enjoy!
         */


        Scanner input = new Scanner(System.in);
        int vehicleYear = 0;
        String result = "";

        System.out.println("Enter vehicle's year:");
        vehicleYear = input.nextInt();
        switch (vehicleYear) {
            case 2001:
            case 2002:
            case 2004:
            case 2006:
            case 2015:
            case 2017:
                result = "Your vehicle needs to be recalled!";
                break;
            default:
                result = "Your vehicle is fine, enjoy!";
        }
        System.out.println(result);

    }
}
