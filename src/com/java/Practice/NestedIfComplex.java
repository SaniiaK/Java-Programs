package com.java.Practice;

import java.util.Scanner;

public class NestedIfComplex {
    public static void main(String[] args) {
        // Write a program to check eligibility to apply for a government SDET position
        //Conditions:High School Diploma, US Citizen, More than 5 years experience
        //IF:
        //1 + 2 but no 3, write come back with more experience
        //2 + 3 but no 1, write go back to school
        //No 2, write Not eligible

        Scanner sc = new Scanner(System.in);
        String educ = "";
        String citizen = "";
        int experience;

        System.out.println(" Please enter your education level: ");

        educ = sc.nextLine();

        System.out.println("Please enter your citizenship:");

        citizen = sc.nextLine();

        System.out.println("Please enter your experience:");

        experience = sc.nextInt();

        if (educ.equals("High School Diploma") && experience > 5) {
            if (citizen.equals("citizen")) {
                System.out.println("You are eligible for the program");
            } else {
                System.out.println("Not Eligible");
            }

        } else if (experience < 5) {
            System.out.println(" Come back with more experience ");
        } else {
            System.out.println("Go back to school");
        }


    }
}
