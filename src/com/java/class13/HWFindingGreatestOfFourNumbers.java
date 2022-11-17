package com.java.class13;

import java.util.Scanner;

public class HWFindingGreatestOfFourNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();
        System.out.println("Enter forth number: ");
        int num4 = sc.nextInt();
        
        int max1 = Math.max(num1, num2);// Math.max is Java utility
        int max2 = Math.max(num3, num4);


        System.out.println("Greatest number " + findMax(max1, max2)); // or System.out.println("Greatest number " + findMax(findMax(num1,num2),findMax(num3,num4)))
        
    }
//    static void findGreatestOfFourNumbers(int a, int b, int c, int d){
//        int result = 0;
//        if (a > b && a >c && a >d ){
//           result = a;
//        } else if ( b > a && b > c && a > d) {
//            result = b;
//        } else if (c > a && c > b && c > d) {
//           result = c;
//        }else if (d > a && d > b && d > c) {
//            result = d;
//        }
//        System.out.println(result + " is the greatest number");
//        }
    static int findMax ( int num1, int num2){
        if (num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
       
    }
    
    

