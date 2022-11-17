package com.java.class06;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        // Write a program to get principle,
        // rate of interest and number of years from the user and calculate simple interest

        double principal = 0;
        double interest = 0;
        int year = 0;
        double simpleInterest = 0;

        Scanner sc = new Scanner (System.in);
        System.out.println( "Enter the loan amount you would like to receive: ");
        principal = sc.nextDouble();
        System.out.println("Enter the amount of years you will need to pay the loan off: ");
        year = sc.nextInt();
        System.out.println("Enter rate of interest: ");
        interest = sc.nextDouble();
        simpleInterest =principal * interest * year;
        System.out.println("Your simple interest rate would be " + simpleInterest);



    }
}
