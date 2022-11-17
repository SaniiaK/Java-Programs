package com.java.class18;

public class HomeWorkPrimeNumbersOneToHundred {
    public static void main (String []args){
//Write a program to print all the prime numbers from 1 to 100


        for ( int a =1; a <=100; a++){
            int counter=0;
            for ( int b =1; b <=100; b ++){
                if (a%b==0){
                    counter++;
                }
            }
            if (counter==2){
                System.out.print(a + "  ");
            }

        }
    }
}
