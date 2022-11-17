package com.java.class15;

public class PrintSumOfFiftyDivisibleByFiveAndThree {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 1; a <= 50; a++) {

            if (a % 5 == 0 || a % 3 == 0) {
                System.out.println(a);
                sum = sum + a;
            }
        }
        System.out.println(sum);
    }

}


//Java program to print the sum of 1 to 50 numbers which are divisible by 5 or by 3