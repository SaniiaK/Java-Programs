package com.java.Practice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class BloodDonor {
    public static void main(String[] args) {
        int age;
        int weight;
        String operator = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        age = sc.nextInt();
        System.out.println("Enter your weight: ");
        weight = sc.nextInt();

        if (age >= 18) {
            if (weight > 50) {
                operator = "Eligible";
            } else {
                operator = "You need eat more";
            }
        } else if (age < 18) {
            if (weight > 50) {
                operator = "Too young";
            } else {
                operator = "Not eligible";
            }
        }
        System.out.println(operator);

    }

}
