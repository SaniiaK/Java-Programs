package com.java.Practice;

import java.util.Scanner;

public class UserDefinedMethod {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first number:");
        int num1 = sc.nextInt();
        System.out.println("Please enter your second number:");
        int num2 = sc.nextInt();
        System.out.println("Please enter your operation");
        String operation = sc.next();
        switch (operation.toLowerCase()){
            case "add":
            add(num1,num2);
            break;

            case "sub":
            sub(num1,num2);
            break;

            case "mul":
            mul(num1,num2);
            break;

            case "div":
            div(num1,num2);
            break;

            case "mod":
            mod(num1,num2);


        }


    }

    static void add(int a, int b){
        System.out.println(a + b);
    }
    static void sub (int a, int b){
        System.out.println(a - b);
    }
    static void mul (int a, int b){
        System.out.println(a * b);
    }
    static void div (int a, int b){
        System.out.println(a / b);
    }
    static void mod (int a, int b){
        System.out.println(a % b);
    }

}
