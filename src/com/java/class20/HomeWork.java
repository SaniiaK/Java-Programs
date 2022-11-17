package com.java.class20;
//============= Homework 01 Nov =============
//Write a program to take the full name from the user
// and print the first letter of the first name and last name
//Example
//Input - Thomas Joe
//Output  - T.J
//Another Example
//Input - Charlie Kyle
//Output - C.K (edited)


import java.util.Scanner;
// This was an interview Question
public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name:");
//        String name = sc.nextLine();
//        String initial = name.charAt(0) + ".";
//
//        for (int i=0; i <name.length(); i++){
//            if ( name.charA
//                System.out.print(initial);
//            }
        String name = sc.nextLine();
        String initial = name.charAt(0) + ".";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                initial = initial + name.charAt(i + 1) + ".";
                System.out.println(initial);

            }

        }
    }
}