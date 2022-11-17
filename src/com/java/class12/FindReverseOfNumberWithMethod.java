package com.java.class12;

import java.util.Scanner;

public class FindReverseOfNumberWithMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 digit number 100 -999: ");
        int num = sc.nextInt();

        int rev = getReverse(num);
        System.out.println(rev);


           }
          static int getReverse(int num) {
              int rev = 0;

              int lastDigit = num % 10;/// Retrieve the last digit from the number
              rev = rev * 10 + lastDigit;// Combine last digit with previous value of reverse number
              num = num / 10;// removing last digit from number

              lastDigit = num % 10;//
              rev = rev * 10 + lastDigit;
              num = num / 10;

              lastDigit = num % 10;
              rev = rev * 10 + lastDigit;
              num = num / 10;
              return rev;
          }
}
