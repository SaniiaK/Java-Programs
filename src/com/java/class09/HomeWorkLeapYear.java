package com.java.class09;

import java.util.Scanner;

public class HomeWorkLeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter year: ");
        int year = sc.nextInt();
        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.println("Leap year");
        }else{
            System.out.println("Not leap year");
        }








// Write a program to get a year from the user and check whether it's a leap year or not
//Example
//Input  : Year = 2000
//Output : Leap year


    }
}
