package com.java.class18;

import java.util.Scanner;

public class PrimeNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
       int count =0;

        for ( int i =2; i <num; i++ ){ // if u want to include number 1 and divisible by 1 than  we do i =1; i<=num
            if (num % i == 0){
                System.out.println(i);
                count++;
            }

        }
        if (count ==0){ // count ==2
            System.out.println("Prime number" );
        }else {
            System.out.println(" Not Prime number");
        }
    }
}
