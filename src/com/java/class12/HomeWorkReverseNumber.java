package com.java.class12;

import com.java.class08.GreatestNumberOutOfThreeNumbers;

import java.util.Scanner;
//Write a program to take three numbers from user and find reverse of the greatest number (3 digit number)
public class HomeWorkReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first 3 digit number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second 3 digit number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third 3 digit number: ");
        int num3 = sc.nextInt();

        GreatestNumberOutOfThreeNumbers(num1, num2, num3);

        if (num1 > num2 && num1 > num3) {
            int rev = ReverseOutOfThreeNum(num1);
            System.out.println(rev + " is reversed of greatest");
        }else if (num2 > num1 && num2 > num3){
            int rev = ReverseOutOfThreeNum(num2);
            System.out.println( rev + " is reverse of greatest");
        } else if (num3 > num1 && num3 > num2) {
            int rev = ReverseOutOfThreeNum(num3);
            System.out.println(rev + " is reversed of greatest");

        }


    }

    static int ReverseOutOfThreeNum(int num) {
        int rev = 0;
        int LastDigit = num % 10;
        rev = rev * 10 + LastDigit;
        num = num / 10;

        LastDigit = num % 10;
        rev = rev * 10 + LastDigit;
        num = num / 10;

        LastDigit = num % 10;
        rev = rev * 10 + LastDigit;
        num = num / 10;

        return rev;
    }

    static void GreatestNumberOutOfThreeNumbers(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is greatest");
        } else if (b > a && b > c) {
            System.out.println(b + " is greatest number ");
        } else if (c > a && c > b) {
            System.out.println(c + " is greatest number");
        }


    }
}

