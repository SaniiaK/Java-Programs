package com.java.class21;

import java.util.Scanner;

// Write a program to print length of the String
//without using .length
public class FindALengthOfTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your name");
        String str =sc.nextLine();
        int count =0;
//        for ( int i =0; i> str.length(); i++){
//            count++;
//        }
//        System.out.println(count);

        while (!str.isEmpty()){
            count++;
            str=str.substring(1);
        }
        System.out.println(count);



    }
}
