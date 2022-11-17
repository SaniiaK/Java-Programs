package com.java.class10;

import java.util.Scanner;
// ====== Homework 10th Oct ======
//Write a program to get 3 digit number from the user (Valid Numbers - 100 to 999 only) and print reverse of the given number in the output
//Example
//Input - 325
//Output - 523

public class HomeWorkReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 digit number 100 -999: ");
        int num = sc.nextInt();

        if (num <= 0 && num <99){
            System.out.println("Invalid entry");
        } else if (num >= 100 && num <=999) {
            int result1 = num%10;
            int result2 = num%100/10;
            int result3 = num/100;


            System.out.println(("Reverse number is " + result1 + result2 + result3) );
            } //(a%10*100)+(a%100-a%10)+(a/100)


    }

    }



