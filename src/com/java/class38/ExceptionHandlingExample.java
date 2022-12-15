package com.java.class38;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter two numbers ");

        try {
            int num1 = sc.nextInt(), num2 = sc.nextInt();
            System.out.println(num1 / num2);
        } catch (InputMismatchException  | ArithmeticException a) {
            System.out.println("Please enter numbers only");
        }catch (Exception ex){
            System.out.println("We ran into an error! Please try after sometimes ");
        }
        System.out.println("Nice to see you");
    }
}
