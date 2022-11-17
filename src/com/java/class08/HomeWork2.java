package com.java.class08;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner BillAmount = new Scanner(System.in);

        System.out.println("Please enter the bill amount:");
        double bill = BillAmount.nextDouble();
        if (bill >= 10000.00) {
            System.out.println("Your discount is 20% and you will pay " + (bill - (bill * 0.2)));
        } else if (bill >= 5000) {
            System.out.println("Your discount is 15% and you will pay " + (bill - (bill * 0.15)));

        } else if (bill >= 2000) {
            System.out.println("Your discount is 10% and you will pay " + (bill - (bill * 0.1)));

        } else if (bill >= 1000) {
            System.out.println("Your discount is 5% and you will pay " + (bill - (bill * 0.05)));

        } else if (bill < 1000) {
            System.out.println(" Your discount is 0% and you will pay " + bill);

        }

    }
}
