package com.java.class12;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printLineWithPlus();
        System.out.println("Welcome to the calculator:");
        printLineWithPlus();


        printLineWithStar();
        System.out.println("Please enter first number:");
        printLineWithStar();
        int num1 = sc.nextInt();

        printLineWithHyphen();
        System.out.println("Please enter second number:");
        printLineWithHyphen();
        int num2 = sc.nextInt();

        printLineWithStar();
        System.out.println(" Here is your addition " + (num1 + num2));
        printLineWithStar();
    }

    // name of the method ->PrintLineWithPlus
    // return type - void
    //Parameter - () <--- No parameters in this case
    //Method body - System.out.println("+++++++")

    static void printLineWithPlus() {
        System.out.println("+++++++++++++++++++++++++++++++++");
    }
    static void printLineWithStar(){
        System.out.println("********************************");

        }
    static void printLineWithHyphen(){
        System.out.println("-----------------------------------");

    }
}
