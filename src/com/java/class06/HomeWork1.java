package com.java.class06;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        //Write a program to get a number from user and print square of given number

        Scanner a = new Scanner (System.in);
        System.out.println("Please enter any number");
        int b = a.nextInt();

        System.out.println("You're square number is " + b * b);

    }
}
