package com.java.class16;

public class FindLengthOfNumber {
    // Write a program to print the length of given number
    public static void main(String[] args) {
        int i =3543346;
        int length = 0;
        while (i>0) {
            length++;
             i = i/10;

        } System.out.println(length);

    }
}
/// Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int count=0;
//
//        while ((num > 0)){
//            num = num /10;
//            count ++;
//        }
//        System.out.println(count);