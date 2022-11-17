package com.java.class16;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class HomeWorkPrintSumOfEachDigitFromNumber {
    public static void main(String[] args) {
//        System.out.println("---------Homework---------");
//        System.out.println("----------Task1----------");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number:");
//        int i = sc.nextInt();
//        int b = 0;
//
//        int sum = 0;
//        while (i > 0) {
//            int lastDigit = i % 10;
//            i = i / 10;
//            sum = lastDigit + sum;
//        }
//        System.out.println(sum);

//        System.out.println("----------Task2----------");
//        int total = 0;
//        int d = 0;
//        int e = 0;
//        for (int a = 10, c = 1; a >= 6; a--, c++) {
//            d = a;
//            e = c;
//            total = d + e + total;
//        }
//        System.out.println(total);


//        System.out.println("--------------Task3-------------");
//
//        double result=0;
//        double num1=0;
//        double num2=0;
//
//        for (double f =1, g =2; f <=10; f++, g++){
//            num1=f;
//            num2=g;
//            result=num1/num2 +result;
//        }
//        System.out.println(result);

        System.out.println("--------Task4---------");



        int givenNumber =6;
        for ( int s =1; s <=givenNumber; s++)
           if (givenNumber%s==0){
               System.out.println(s);
            }
        }



    }




//Write a program to print sum of each digit from the given number
//Input - 43634
//Output - 20
//  2.  Java program to find result of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5
//  3.  Java program to find result of 1/2 + 2/3 + 3/4 + 4/5 +......10/11
//  4.  Write a program to find factors of the given number
//Input - 6
//Output - 1 2 3 6