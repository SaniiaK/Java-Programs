package com.java.class05;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        //Write a program to take total bill amount and discount percentage from user and print value of final bill amount after discount

        double subtotal = 0;
        int discount = 0;
        double total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total: ");
        subtotal = input.nextDouble();
        System.out.println("Enter discount amount: ");
        discount = (int) input.nextDouble();

        total = subtotal - discount * subtotal / 100;

        System.out.println(" Your final bill after discount is " + total);
    }
}
