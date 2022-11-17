package com.java.class07;

import java.util.Scanner;

// Write a program to take age from user and print wether they are
//eligible for driving license or not
public class IfElseExample2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age?");
        int a = scan.nextInt();
        if (a >= 16) {
            System.out.println("You are eligible to get driving license");
        } else {
            System.out.println("You are not eligible to get driving license");
        }


    }
}
