package com.java.class08;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String [] args){
        Scanner InNum = new Scanner (System.in);

        System.out.println("Please enter number:");
        int num1 = InNum.nextInt();
         if (num1 % 5 ==0){
             System.out.println("Number is divisible by 5");

         }else {
             System.out.println("Number isn't divisible by 5");
         }

    }

}
