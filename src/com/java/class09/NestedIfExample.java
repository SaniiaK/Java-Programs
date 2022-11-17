package com.java.class09;
// Write a program to get age and weight from the user and print message based on

import java.util.Scanner;

// 1. User has age more than  or equal to 18 and weight more than equal to 50
//then they are eligible for blood donation
//2. If user has age less than 18 and weight greater than 50 then print you're too young to donate blood
//3. If usre has age greater than 18 and weight less than 50 then print you're underweight. Please eat more and try again.
//4. If user has age less than 18 and weight less than 50 then print, you're eligible
public class NestedIfExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println("Please enter your weight: ");
        int weight =sc.nextInt();
//
//        if (age >= 18 && weight >= 50){
//            System.out.println("You are eligible to donate blood");
//        } else if (age <18 && weight > 50) {
//            System.out.println("You are too young to donate blood");
//
//        } else if (age >18 && weight <50) {
//            System.out.println("You are underweight, please eat more");
//        } else if (age <18 && weight <50) {
//            System.out.println("You are eligible");
//        }else {
//            System.out.println("Not valid");
//        }
        // Nested If-else

        if (age >=18){
            if(weight >=50){
                System.out.println("You're eligible");
            }else {
                System.out.println(("You're underweight"));
            }
        }else {
            if(weight >=50){
                System.out.println("You are too young to donate");
            }else{
                System.out.println("you're not eligible");
            }
        }

    }
}
