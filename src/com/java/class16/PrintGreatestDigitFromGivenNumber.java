package com.java.class16;

import java.util.Scanner;

public class PrintGreatestDigitFromGivenNumber {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int num = sc.nextInt();
        int greatestDigit1=0;
        int a =9;
        while (num>0){
            num= num%10;
            greatestDigit1 = num;
            num=num/10;
            if (greatestDigit1 <= a){
                System.out.println( greatestDigit1);
            }


             }
//          int max = num%10;
        //while (num !=0) {
        //int lastDigit = num %10;
        // if (max < lastDigit){
        //      max = lastDigit;}
        //      num = num/10;}
        //sout(max)}


        }
    }

