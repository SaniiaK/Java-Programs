package com.java.class07;

import java.util.Scanner;

public class LadderExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number:");
        int mark = sc.nextInt();
        if (mark >= 100 ) {
            System.out.println("Error");
        } else if (mark >= 90){
            System.out.println("Your result is A+");
        } else if (mark > 80) {
            System.out.println("Your result is A");
        } else if (mark > 70) {
            System.out.println("Your result is B+");
        } else if (mark >60) {
            System.out.println("Your result is B");
        } else if (mark > 50) {
            System.out.println("Your result is C+");
        } else if (mark > 40) {
            System.out.println("Your result is C");
        }else if ( mark == 40){
            System.out.println("Fail");
        }else if (mark == 0 ){
            System.out.println("Enter numbers 1-100");
        }else {
            System.out.println("Invalid");
        }

    }
}