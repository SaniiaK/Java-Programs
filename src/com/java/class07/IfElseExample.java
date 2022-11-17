package com.java.class07;

import java.util.Scanner;

// Write a program to get two number from user and print maximum number
public class IfElseExample {
    public static void main(String[] args) {

        Scanner user= new Scanner(System.in);

        double a = 0;
        double b = 0;

        System.out.println("Please enter number: ");

         a = user.nextDouble();


        System.out.println("Please enter number: ");

         b =user.nextDouble();

       // System.out.println("The maximum number is " + Math.max (a,b));

        if (a > b){
            System.out.println("Maximum number is " + a);

        }else {
            System.out.println("Maximum number is " + b);
        }



    }
}
