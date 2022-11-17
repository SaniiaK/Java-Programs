package com.java.class15;

public class HomeWorkSumOfTen {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<= 10; i ++ ){ // for ( int i=2; i<=10; i=i+2)
            if (i % 2 == 0)          // sum = sum +i
            sum = sum + i;

        }
        System.out.println(sum);

    }
}

// Java program to print the sum of even numbers from 1 to 10
