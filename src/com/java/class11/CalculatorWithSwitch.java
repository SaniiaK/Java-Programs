package com.java.class11;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();
        System.out.println(" Please enter method Add, Sub, Mul, Div, Mod:");
        String method = sc.next();
        System.out.println("Please enter second number:");
        int num2 =sc.nextInt();

        switch (method.toLowerCase() ){ // .toLower make is it ignore case sensitivity. Everything will be transferred to lower case; if need more options we can add another case
            case "add":
            case "+":
            case "Add":
                System.out.println(num1 + num2);
                break;
            case "sub":
            case "-":
                System.out.println(num1 - num2);
                break;
            case "mul":
            case "*":
                System.out.println(num1 * num2);
                break;
            case "div":
            case "/":
                System.out.println(num1 / num2);
                break;
            case "mod":
            case "%":
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Invalid entry");

        }
    }
}
