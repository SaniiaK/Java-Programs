package com.java.class15;

public class HomeWorkPrintSumOfTheseNumbers {
    public static void main(String[] args) {
        int total = 0;

        for (int a = 1; a <= 10; a++) {
            if (a % 3 == 0) {
                total = total - a;
                System.out.println(a);
            } else {
                total = total + a;
                System.out.println(a);
            }

        }
        System.out.println(total);


    }


}


//Java program to Print sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10
