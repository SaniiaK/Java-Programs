package com.java.class38;

import java.util.InputMismatchException;
import java.util.Scanner;



    public class ExceptionPractice {
        public static void main(String[] args) {
            try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter two numbers ");
            int num1 = sc.nextInt(), num2 = sc.nextInt();
            System.out.println(num1 / num2);

            }catch (Exception e){ // this exception error will handle all the exceptions, usually if we dont know what kind of an exception it is we can use that one
                System.out.println("We ran into an error! Please try after sometimes ");
            }
            System.out.println("Nice to see you");
        }
    }


