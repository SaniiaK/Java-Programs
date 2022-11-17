package com.java.class09;

import java.util.Scanner;

// Write a program to reads power consumed in units and print the amount to be paid by the customer
//  Consumption   Rate of Units Charges are as follows
//  ------------------------------------------------------
//  If unit is 0-200       Rs.0.50 per unit
//  If unit is 201-400     Rs.100 plus Rs.0.65 per unit
//  If unit is 401-600     Rs.230 plus Rs.0.80 per unit
//  -------------------------------------------------------
public class HomeWorkPowerConsumed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter amount of power consumed in units 0-600:");
        double consumption = sc.nextDouble();
        double finalBill = 0;

        if (consumption <= 0){
            System.out.println(" Enter correct data");
        } else if (consumption <= 200){
            finalBill = consumption * 0.50;
            System.out.println("Your bill is  "+ finalBill);

            }else if (consumption <=400){
            finalBill = consumption *0.65 +100;
            System.out.println("Your bill is " + finalBill);
        } else if (consumption <= 600) {
            finalBill = consumption * 0.80 + 230;
            System.out.println("Your bill is "+ finalBill);

        }else {
            System.out.println(" Error");
        }

    }

}
