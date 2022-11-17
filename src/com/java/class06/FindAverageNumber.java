package com.java.class06;

import java.util.Scanner;

public class FindAverageNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter your age? ");

        int a = sc.nextInt ();

        System.out.println("You are " + (a * 12) + " months old");
        System.out.println("You are " + (a * 365) + " days old");
        System.out.println("You are " + (a * 525600) + " minutes old");


    }
}
