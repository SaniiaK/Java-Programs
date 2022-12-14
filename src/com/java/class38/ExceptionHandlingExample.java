package com.java.class38;

import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter two numbers ");

        int num1 = sc.nextInt(), num2    = sc.nextInt();
        System.out.println(num1 / num2);
    }
}
