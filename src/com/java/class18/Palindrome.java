package com.java.class18;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number:");
        int num = sc.nextInt();
        int rev=0;
        int rev_num=num;


        while ( rev_num >0){
            rev= rev*10 + rev_num %10;
            rev_num = rev_num / 10;

        }
        System.out.println(rev_num);

        if (num == rev){
            System.out.println(" Palindrome");

        }else{
            System.out.println(" Not Palindrome");
        }
    }
}
