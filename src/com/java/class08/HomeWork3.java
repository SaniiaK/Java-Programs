package com.java.class08;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String [] args){
        Scanner ch = new Scanner (System.in);
        System.out.println("Please enter your rating number: ");
        int rate = ch.nextInt();

        if (rate > 5){
            System.out.println(" Invalid enter, use numbers 1-5");
        } else if (rate <0 ) {
            System.out.println("Error");
        } else if (rate == 5){
            System.out.println("Very Good");
        } else if (rate == 4) {
            System.out.println("Good");

        } else if (rate == 3) {
            System.out.println("Average");
        } else if (rate == 2) {
            System.out.println("Poor");
        } else if (rate ==1) {
            System.out.println("Very Poor");

        }else{
            System.out.println("Invalid");
        }
    }
}
