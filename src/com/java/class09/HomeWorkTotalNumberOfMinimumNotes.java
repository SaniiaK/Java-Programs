package com.java.class09;

import java.util.Scanner;

public class HomeWorkTotalNumberOfMinimumNotes {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);


        System.out.println("Enter amount: ");
        int amount = userIn.nextInt();
        int result;

        result = amount / 500;
        if (result > 0) {
            if (result == 1) {
                System.out.println(result + " note of 500");
            } else {
                System.out.println(result + " notes of 500");
            }
            amount = amount % 500;
        }
        result = amount / 100;
        if (result > 0) {
            if (result > 1) {
                System.out.println(result + " notes of 100");
            } else {
                System.out.println(result + " note of 100");
            }
            amount = amount % 100;
        }
        result = amount / 20;
        if (result > 0) {
            if (result > 1) {
                System.out.println(result + " notes of 20");
            } else {
                System.out.println(result + "note of 20");
            }
            amount = amount % 20;
        }
        result = amount / 10;
        if (result > 0) {
            if (result > 1) {
                if (result > 1) {
                    System.out.println(result + " notes of 10");
                } else {
                    System.out.println(result + " note of 10");
                }
                amount = amount % 10;
            }
            result = amount / 5;
            if (result > 0) {
                if (result > 1) {
                    System.out.println(result + " notes of 5");
                } else {
                    System.out.println(result + " note of 5");
                }
                amount = amount % 5;
            }
            result = amount / 2;
            if (result > 0) {
                if (result > 1) {
                    System.out.println(result + " notes of 2");
                } else {
                    System.out.println(result + " note of 2");
                }
                amount = amount % 2;
            }
            result = amount / 1;
            if (result > 1) {
                System.out.println(result + " notes of 1");

            }


        }
    }
}

