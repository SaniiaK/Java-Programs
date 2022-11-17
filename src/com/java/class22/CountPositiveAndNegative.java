package com.java.class22;

public class CountPositiveAndNegative {
    // Write a program to count number of +ve and -ve from array
    public static void main(String[] args) {
        int data [] = {-12, 34, -45, 54, -23, 56, 78, -2, 21};
        int positive =0;
        int negative =0;
        for ( int i=0; i <data.length; i++){
            if (data[i]>0){
                positive++;
            }else {
                negative++;
            }
        }
        System.out.println(positive + " - positive numbers:   " + negative + " - negative numbers:");

    }
}
