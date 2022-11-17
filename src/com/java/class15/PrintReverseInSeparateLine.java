package com.java.class15;

import java.util.Scanner;

public class PrintReverseInSeparateLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        ReverseNumber(num);
    }
//          int num =3581;
    //         while (num >0) { // while (num!=0)
    //          System.out.println(num%10);
    //          num = num/10;
    static void ReverseNumber(int num) {
        int rev_num = 0;
        while (num > 0) {
            rev_num = num % 10;
            System.out.println(rev_num);
            num = num / 10;
        }
    }

}
//Write a program to print each digit of the number into a separate line in reverse order
//Example
//Input - 3575
//Output
//5
//7
//5
//3